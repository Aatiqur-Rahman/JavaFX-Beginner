/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwithdb;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    public ConnectionClass conn = new ConnectionClass();
    
    @FXML
    private Label isConnected;
    
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (conn.isDbConnected()){
            isConnected.setText("Connected");
        }
        else {
            isConnected.setText("Not Connected");
        }
    }
    public void login (ActionEvent event) {
        try{
            
            if(conn.islogin(username.getText(),password.getText())){
            isConnected.setText("UserName and Password is Correct");
            }
             else {isConnected.setText(username.getText());}
        }
        catch(SQLException e){
            isConnected.setText("UserName and password is not correct");
        }
        
    }
    
}
