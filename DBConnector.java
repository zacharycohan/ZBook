package zbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.*;

/**
 *
 * @author Zack
 */
public class DBConnector {
    static Connection conn = null;
    URL url = getClass().getResource("master.db");
    
    
    public  Connection connect()
    {
        System.out.println(url.toString());
        String path = url.getPath();
        
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+url.getPath());
            conn.setAutoCommit(false);
            return conn;
        }
        catch(Exception e){
            e.printStackTrace(System.out);
            return null;
        }
    }
}
