/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connector {
    public static Connection connector () throws SQLException{
        try {
            /*
            Class.forName("org.sqlite.JDBC");
             Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Desktop\\DB\\Students.db");
            */
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Desktop\\DB\\Students.db");
            return  conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
