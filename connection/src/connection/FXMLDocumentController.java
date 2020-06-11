/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    private Connection conn=null;
    
    @FXML
    private Label isConnected;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{    
        conn=connector.connect();
        System.out.println(conn);
        if (conn==null){isConnected.setText("NotConnected");}
        else {isConnected.setText("Connected");}
        }
        catch(Exception e){
        }
        
    }
}
    

