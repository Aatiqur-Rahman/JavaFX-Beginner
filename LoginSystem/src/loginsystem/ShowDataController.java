package loginsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import loginsystem.Connector;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ShowDataController implements Initializable {

    @FXML
    private TableView<Students> c_table;
    @FXML
    private TableColumn<?, ?> c_id;
    @FXML
    private TableColumn<?, ?> c_name;
    @FXML
    private TableColumn<?, ?> c_mobile;
    @FXML
    private TableColumn<?, ?> c_username;
    @FXML
    private TableColumn<?, ?> c_password;
    private ObservableList <Students> data;
    
    Connection conn= null;
    PreparedStatement pst=null;
    ResultSet rst=null;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            conn=Connector.connector();
            data=FXCollections.observableArrayList();
            setTable();getData();
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowDataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void setTable(){
        c_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
        c_name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        c_mobile.setCellValueFactory(new PropertyValueFactory<>("Mobile"));
        c_username.setCellValueFactory(new PropertyValueFactory<>("Username"));
        c_password.setCellValueFactory(new PropertyValueFactory<>("Password"));
    }
    public void getData() throws SQLException{
       try{ String sql="select * from Student";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            while(rst.next()){
                data.add(new Students (rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(5),rst.getString(6)));
            }
        }
       catch(SQLException e){
       }
       c_table.setItems(data);
    }
}
