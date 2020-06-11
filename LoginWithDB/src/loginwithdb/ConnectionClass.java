/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwithdb;

import java.sql.*;


public class ConnectionClass {
    Connection conn;
    public ConnectionClass(){
        conn=Connector.Connect();
        if (conn==null){System.exit(1);}
    }
    public boolean isDbConnected(){
        try {
            return !conn.isClosed();
        } catch (SQLException ex) {
            return  false;  
        }
    }
    public boolean islogin(String User,String pass) throws SQLException{
        PreparedStatement preparedstatement;
        ResultSet resultset;
        String Query="select * from Students where Username=? and Password=?";
        try{
            preparedstatement=conn.prepareStatement(Query);
            preparedstatement.setString(1,User);
            preparedstatement.setString(2,pass);
            resultset=preparedstatement.executeQuery();
            if (resultset.next()){return true;}
            else {return false;}
        }
        catch(Exception e){
            return false;
        }
    }
    
}
