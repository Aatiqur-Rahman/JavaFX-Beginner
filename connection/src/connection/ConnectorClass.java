/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package connection;

import java.sql.*;


public class ConnectorClass {
    Connection connection;
    public ConnectorClass(){
        connection = connector.connect();
        if (connection==null){
            System.exit(1);
        }
    }
    public boolean isDbConnected(){
        try{
           return !connection.isClosed();
        }
        catch(SQLException e){
            return false;
        }        
    }        
}*/