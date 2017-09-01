package zbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class ZBook {

    protected static String status;
    protected static int emp_ID;

    public static final int IN_PLACE = 0;
    public static final int CHECKED_OUT = 1;
    public static final int LOST = 2;
    public static final int DAMAGED = 3;
    private static boolean verified;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        verifyWorker();
    }

    public static int statusInt(String s) {
        if (s.equalsIgnoreCase("In Place")) {
            return IN_PLACE;
        } else if (s.equalsIgnoreCase("Checked Out")) {
            return CHECKED_OUT;
        } else if (s.equalsIgnoreCase("lost")) {
            return LOST;
        } else if (s.equalsIgnoreCase("damaged")) {
            return DAMAGED;
        } else {
            return -1;
        }
    }

    private static void verifyWorker() {
        LoginUI.runLoginUI();
    }
    
    protected static File createHTML() throws IOException{
        File html = new File("NextSevenDays.html");
        
        
        FileWriter fw = new FileWriter(html);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("<!DOCTYPE html>");
        bw.write("<html>"
                + "<style>"
                + "table{"
                + "width:100%"
                + "}"
                + "table, th, td {\n" 
                +   "border: 1px solid black;\n"
                +   "border-collapse: collapse;\n" 
                +"}"
                + "</style>"
                + " <title>Bookings</title>"
                + "<body>"
                + " <table>"
                + "     <th>Patron Name</th>"
                + "     <th>Item Name</th>"
                + "     <th>Patron ID</th>"
                + "     <th>Copy Number</th>"
                + "     <th>Start Date</th>"
                + "     <th>Start Time</th>"
                + "     <th>End Date</th>"
                + "     <th>End Time</th>");

        
        Connection c = new DBConnector().connect();
        long rn = System.currentTimeMillis();
        long today = ZTime.todayMillis(rn);

        try {
            Statement stmt = c.createStatement();
            String sizeQuery;
            String query = "select first_name, last_name, patron_ID, name, copy_number,start_time,end_time from "
                    + "Patron NATURAL JOIN Item NATURAL JOIN Booking where start_time >= "+today+" AND start_time < "+(today+ZTime.MILLIS_IN_WEEK);
            sizeQuery = " select count(*) as size from ( "+query+" );";
            query += " ORDER BY start_time, last_name, first_name, patron_ID;";
            ResultSet rs = stmt.executeQuery(sizeQuery);
            rs.next();
            int size = rs.getInt("size");
            
            rs = stmt.executeQuery(query);
            rs.next();
            for(int i = 0; i < size; i++){

                String first = rs.getString("first_name");
                String last = rs.getString("last_name");
                String id = Integer.toString(rs.getInt("patron_ID"));
                String itemName = rs.getString("name");
                String copyNumber = Integer.toString(rs.getInt("copy_number"));
                long st = rs.getLong("start_time");
                long et = rs.getLong("end_time");
                String startDate = ZTime.MonthDayYearDate(st);
                String startTime = ZTime._24HourTime(st);
                String endDate = ZTime.MonthDayYearDate(et);
                String endTime = ZTime._24HourTime(et);        
                

                
                bw.write("<tr>\n");
                    bw.write("<td>"+first+" "+last+"</td>\n");
                    bw.write("<td>"+id+"</td>\n");
                    bw.write("<td>"+itemName+"</td>\n");
                    bw.write("<td>"+copyNumber+"</td>\n");
                    bw.write("<td>"+startDate+"</td>\n");
                    bw.write("<td>"+startTime+"</td>\n");
                    bw.write("<td>"+endDate+"</td>\n");
                    bw.write("<td>"+endTime+"</td>\n");
                bw.write("</tr>\n");
                
                rs.next();
            }
            
            
           c.close();        
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        
        
        
        
        bw.write("</table>\n</body>\n</html>");
        bw.close();
        fw.close();
        return html;
    }



    public static boolean doubleBooked(long barcode, long yourStartTime, long yourEndTime) {

        LinkedList<Boolean> bools = new LinkedList<>();
        Connection c = new DBConnector().connect();
        try {
            Statement stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery("select count(*) as size from"
                    + " Booking where barcode == " + barcode);

            int size = rs.getInt("size");
            String sql = "select start_time, end_time from Booking"
                    + " where barcode == " + barcode;
            rs = stmt.executeQuery(sql);
            //check to see if there are any other active bookings
            rs.next(); //move the pointer to the first item
            for (int i = 0; i < size; i++) {
                long st = rs.getLong("start_time");
                long et = rs.getLong("end_time");
                
                if(  (yourStartTime < st && yourEndTime < st) || (yourStartTime > et)  ){
                    bools.add(false);
                    
                }
                else {
                    bools.add(true);
                   
                }

                rs.next();
            }
            
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            
        }
        for(boolean b : bools)
        {
            System.out.println(b);
            if(b)return true;
        }
        return false;
    }

}
