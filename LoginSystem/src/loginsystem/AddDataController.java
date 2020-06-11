/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AddDataController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private Label lbl;
    @FXML
    private TextField username;
    @FXML
    private TextField name;
    @FXML
    private TextField mobile;
    @FXML
    private PasswordField password;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> c_id;
    @FXML
    private TableColumn<?, ?> c_name;
    @FXML
    private TableColumn<?, ?> c_mobile;
    
    PreparedStatement pst = null;
    ResultSet rst = null;
    Connection conn = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn=Connector.connector();
        } catch (SQLException ex) {
            Logger.getLogger(AddDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void add(ActionEvent event) {
        String query="insert into Student (id , name , mobile , username , password) values (?,?,?,?,?)";
        String ID=id.getText();
        String Name=name.getText();
        String Mobile=mobile.getText();
        String Username=username.getText();
        String Password=password.getText();
        
       
        try {
            pst=conn.prepareStatement(query);
            pst.setString(1, ID);
            pst.setString(2, Name);
            pst.setString(3, Mobile);
            pst.setString(4, Username);
            pst.setString(5, Password);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
