/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbook;

import java.awt.Cursor;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class SearchItemPanel extends javax.swing.JPanel {

    String fn;
    String desc;
    long barcode;

    /**
     * Creates new form SearchItemPanel
     */
    public SearchItemPanel(String itemName, int copyNumber, String description, String status, long barcode, String fn) {
        initComponents();
        itemNameLabel.setText("name: " + itemName);
        copyNumberLabel.setText("copy no: " + Integer.toString(copyNumber));
        this.barcode = barcode;
        if (description == null) {
            descLabel.setText("description:");
        } else if (description.length() < 11) {
            descLabel.setText("description: " + description);
        } else {
            descLabel.setText("description: " + description.substring(0, 11) + "...");
        }
        statusLabel.setText("status: " + status);
        barcodeLabel.setText("barcode: " + Long.toString(barcode));
        this.fn = fn;
        this.desc = description;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemNameLabel = new javax.swing.JLabel();
        copyNumberLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addToBookingButton = new javax.swing.JButton();
        editItemLabel = new javax.swing.JLabel();
        barcodeLabel = new javax.swing.JLabel();
        viewItemLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(310, 127));
        setMinimumSize(new java.awt.Dimension(310, 127));

        itemNameLabel.setText("itemname");
        itemNameLabel.setName(""); // NOI18N

        copyNumberLabel.setText("copynumber");

        descLabel.setText("description");

        statusLabel.setText("status");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addToBookingButton.setText("add to booking");
        addToBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBookingButtonActionPerformed(evt);
            }
        });

        editItemLabel.setForeground(java.awt.Color.blue);
        editItemLabel.setText("edit item");
        editItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editItemLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editItemLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editItemLabelMouseExited(evt);
            }
        });

        barcodeLabel.setText("barcode");

        viewItemLabel.setForeground(java.awt.Color.blue);
        viewItemLabel.setText("view item");
        viewItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewItemLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewItemLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewItemLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barcodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(descLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(copyNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(itemNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(statusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToBookingButton)
                    .addComponent(viewItemLabel)
                    .addComponent(editItemLabel))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addGap(6, 6, 6)
                .addComponent(barcodeLabel)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(editItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addToBookingButton)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editItemLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editItemLabelMouseEntered
        editItemLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_editItemLabelMouseEntered

    private void editItemLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editItemLabelMouseExited
        editItemLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_editItemLabelMouseExited

    private void viewItemLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewItemLabelMouseEntered
        viewItemLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_viewItemLabelMouseEntered

    private void viewItemLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewItemLabelMouseExited
        viewItemLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_viewItemLabelMouseExited

    private void editItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editItemLabelMouseClicked
        EditItemUI.runEditItemUI(
                itemNameLabel.getText().substring(6),
                Integer.parseInt(copyNumberLabel.getText().substring(9)),
                desc,
                fn,
                statusLabel.getText().substring(8),
                Long.parseLong(barcodeLabel.getText().substring(9))
        );
    }//GEN-LAST:event_editItemLabelMouseClicked

    private void addToBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBookingButtonActionPerformed
        if (MainUI.cart == null) {
            JOptionPane.showMessageDialog(null, "Please create a booking before adding items\n"
                    + "You can do this by searching for a patron (by name or id) and then clicking on \"create Booking\" \n"
                    + "in the \"Search Results\" panel");
        } else {
            String bc = barcodeLabel.getText().substring(9);
            if(ZBook.doubleBooked(Long.parseLong(bc), MainUI.cart.getStartTime(), MainUI.cart.getEndTime()))
            {
                JOptionPane.showMessageDialog(null, "This item is already booked for that time slot");
            }
            else{
                
                MainUI.cart.addItem(barcode);
                MainUI.cartLabel.setText("cart(" + MainUI.cart.size() + ")");
            
            }
//            System.out.println("BARCODE: " + bc);
//            Connection c = DBConnector.connect();
//            try {
//
//                String query = "select start_time,end_time from Booking where barcode ==  " + bc;
//                String sizeQuery = "select count(*) as size from (" + query + ");";
//                query += ";";
//                //System.out.println("our search query: "+query);
//                Statement stmt = c.createStatement();
//                ResultSet rs = stmt.executeQuery(sizeQuery);
//                rs.next();
//                int size = rs.getInt("size");
//                if (size == 0) {
//                    MainUI.cart.addItem(barcode);
//                    MainUI.cartLabel.setText("cart(" + MainUI.cart.size() + ")");
//                    c.close();
//                    return;
//                }
//
//                long st;// = rs.getLong("start_time");
//                long et;// = rs.getLong("end_time");
//                rs = stmt.executeQuery(query);
//                rs.next();
//                for (int i = 0; i < size; i++) {
//                    st = rs.getLong("start_time");
//                    et = rs.getLong("end_time");
//                    if (ZBook.doubleBooked(Long.parseLong(bc), st, et)) {
//                        JOptionPane.showMessageDialog(null, "This item is already booked for that time slot");
//                        c.close();
//                        return;
//                    }
//                }
//                c.close();
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
//            }
//
//            MainUI.cart.addItem(barcode);
//            MainUI.cartLabel.setText("cart(" + MainUI.cart.size() + ")");
        }
    }//GEN-LAST:event_addToBookingButtonActionPerformed

    private void viewItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewItemLabelMouseClicked
        DefaultListModel model = new DefaultListModel();
        MainUI.bookingsForItemList.setModel(model);
        model.removeAllElements();

        MainUI.itemNameLabel.setText(itemNameLabel.getText());
        MainUI.copyNumberLabel.setText(copyNumberLabel.getText());
        MainUI.itemStatusLabel.setText(statusLabel.getText());
        //MainUI.ownerLabel.setText(finesLabel.getText());

        Connection c = new DBConnector().connect();
        try {

            Statement stmt = c.createStatement();
            String query = "select first_name, last_name, patron_ID from Patron NATURAL JOIN Has where barcode == " + barcodeLabel.getText().substring(9);
            ResultSet rs = stmt.executeQuery(query);

            if (rs.isClosed()) {
                MainUI.ownerLabel.setText("Patron who currently has Item: N/A");
            } else {
                rs.next();
                MainUI.ownerLabel.setText("Patron who currently has Item: " + rs.getString("first_name") + " " + rs.getString("last_name") + " - " + rs.getInt("patron_ID"));
            }

            query = "select first_name, last_name, start_time, end_time from Patron NATURAL JOIN BOOKING where Booking.barcode == "
                    + "" + barcodeLabel.getText().substring(9);

            String sizeQuery = "select count(*) as size from (" + query + ");";

            query += " ORDER BY start_time;";
            rs = stmt.executeQuery(sizeQuery);
            int size = rs.getInt("size");

            if (size == 0) {
                model.addElement("No bookings for this item");
                MainUI.bookingsForItemList.setModel(model);
                c.close();
                return;
            }

            rs = stmt.executeQuery(query);
            rs.next();
            String first;
            String last;
            long start;
            long end;

            for (int i = 0; i < size; i++) {
                first = rs.getString("first_name");
                last = rs.getString("last_name");
                start = rs.getLong("start_time");
                end = rs.getLong("end_time");

                String sdow = ZTime.getDayOfWeek(start).toString().substring(0, 3) + ".";
                String smonth = ZTime.getMonth(start).toString().substring(0, 3) + ".";
                int sday = ZTime.getDay(start);
                int syear = ZTime.getYear(start);
                int shour = ZTime.getHour(start);
                int smin = ZTime.getMinute(start);

                String shourStr = shour < 10 ? "0" + Integer.toString(shour) : Integer.toString(shour);

                String sminStr = smin < 10 ? "0" + Integer.toString(smin) : Integer.toString(smin);

                //System.out.println(sdow+" "+smonth+" "+sday+", "+syear+" at "+shour+":"+smin);
                String edow = ZTime.getDayOfWeek(end).toString().substring(0, 3) + ".";
                String emonth = ZTime.getMonth(end).toString().substring(0, 3) + ".";
                int eday = ZTime.getDay(end);
                int eyear = ZTime.getYear(end);
                int ehour = ZTime.getHour(end);
                int emin = ZTime.getMinute(end);

                String ehourStr = ehour < 10 ? "0" + Integer.toString(ehour) : Integer.toString(ehour);

                String eminStr = emin < 10 ? "0" + Integer.toString(emin) : Integer.toString(emin);

                String sStr = sdow + " " + smonth + " " + sday + ", " + syear + " at " + shourStr + ":" + sminStr;
                String eStr = edow + " " + emonth + " " + eday + ", " + eyear + " at " + ehourStr + ":" + eminStr;

                //System.out.println(edow+" "+emonth+" "+eday+", "+eyear+" at "+ehour+":"+emin);
                String s = first + " " + last + " has this item booked from " + sStr + " until " + eStr;

                model.addElement(s);
                rs.next();

            }
            MainUI.bookingsForItemList.setModel(model);
            c.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
        }

    }//GEN-LAST:event_viewItemLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBookingButton;
    private javax.swing.JLabel barcodeLabel;
    private javax.swing.JLabel copyNumberLabel;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel editItemLabel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel viewItemLabel;
    // End of variables declaration//GEN-END:variables
}
