 /*
/*
/*
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField mobile;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    
    private Connection conn=null;
    private PreparedStatement pst = null;
   private ResultSet rs = null;
   private ObservableList <Students> data;
    
    
    
    @FXML
    private Label check;
    @FXML private TextField search;
    
    @FXML
    private TableView<Students> table;
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
    @FXML
    private void add (ActionEvent event) throws SQLException{
        String sql ="insert into 'Student' (id , name , mobile , username , password) values (?,?,?,?,?)";
        String ID=id.getText();
        Validation.Checking.isempty(id, check, "ERROR");
        String Name=name.getText();      
        String Mobile=mobile.getText();      
        String userName=username.getText();      
        String passWord=password.getText();      
                
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,ID);
            pst.setString(2,Name);
            pst.setString(3,Mobile);
            pst.setString(4,userName);
            pst.setString(5,passWord);
            int i = pst.executeUpdate();
            if (i==1)AlertDialogue.display("Information", "Updated");
            settable();
            loadData();
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            pst.close();
            
        }
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            conn=Connector.connect();
            System.out.println(conn);
            data= FXCollections.observableArrayList();
            settable();
            loadData();
            setvalueOnMouse();
            search();
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     *
     */
    public void settable(){
            c_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
            c_name.setCellValueFactory(new PropertyValueFactory<>("Name"));
            c_mobile.setCellValueFactory(new PropertyValueFactory<>("Mobile"));
            c_username.setCellValueFactory(new PropertyValueFactory<>("Username"));
            c_password.setCellValueFactory(new PropertyValueFactory<>("Password"));
        }
    private void loadData(){
            data.clear();
        try {
            String sql= "select*from Student";        
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                data.add(new Students(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        table.setItems(data);
        }
    private void setvalueOnMouse(){ 
        table.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                Students std=table.getItems().get(table.getSelectionModel().getSelectedIndex());
                id.setText(std.getID());
                name.setText(std.getName());
                mobile.setText(std.getMobile());
                username.setText(std.getUsername());
                password.setText(std.getPassword());
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        }

    @FXML
    private void update(ActionEvent event) {
        String sql="update Student SET Name=?,Mobile=?,Username=?,Password=? WHERE ID=?";
            String ID=id.getText();
            Validation.Checking.isempty(id, check, "ERROR");
            String Name=name.getText();      
            String Mobile=mobile.getText();      
            String userName=username.getText();      
            String passWord=password.getText();
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,Name);
            pst.setString(2,Mobile);
            pst.setString(3,userName);
            pst.setString(4,passWord);
            pst.setString(5,ID);
            int i = pst.executeUpdate();
            if (i==1){AlertDialogue.display("Information", "Updated");
               loadData();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void search(){
        search.setOnKeyReleased(e -> {
            if (search.getText().equals("")){
                loadData();
            }
            data.clear();
            String sql = "select * from Student where ID = ? ";
            try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs=pst.executeQuery();
            while (rs.next()){
                data.add(new Students(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(6)));
            }
            table.setItems(data);
            } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
             }
        });
        
    }            
    
            
}//Initialize Method
             
    
