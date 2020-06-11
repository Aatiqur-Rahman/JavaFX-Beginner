/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import java.io.IOException;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    @FXML
    private Label isConnected;
    @FXML
    private TableColumn<?, ?> Table;
    @FXML
    private TableColumn<?, ?> c_id;
    @FXML
    private TableColumn<?, ?> c_name;
    @FXML
    private TableColumn<?, ?> c_age;
    
    private Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rst=null;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn = Connector.connector();
            if (conn==null){
                isConnected.setText("Not Connected :')");
            }else {
                isConnected.setText("Connected");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void login(ActionEvent event) {
        String sql="select * from Student where Username= ? and Password=?";
        String user= username.getText();
        String pass= password.getText();
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            rst=pst.executeQuery();
            if (rst.next()){
                isConnected.setText("Username and Password is Correct");
                ((Node)event.getSource()).getScene().getWindow().hide();
                try {
                    Stage stage =new Stage();
                    stage.setTitle("Adding data");
                    Parent root;
                    root = FXMLLoader.load(getClass().getResource("ShowData.fxml"));
                    Scene scene = new Scene(root,500,500);
        
                     stage.setScene(scene);
                     stage.show();
                } catch (IOException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                
            }
            else {isConnected.setText("Username and Password is not Correct");}
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
