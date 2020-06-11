/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

public class connector {
    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Desktop\\DB\\Students.db");
            return conn;
        }
        catch (Exception e){
            return null;
        }
    }
}
