/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwithdb;

import java.sql.*;


public class Connector {
   public static Connection Connect(){
    
       try {
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Desktop\\DB\\Students.DB");
           return conn;
       } catch (Exception ex) {
           return null;
       } 
    }
}
