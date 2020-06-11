/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Page1Controller implements Initializable {

    
    @FXML private ListView <String> listview;
    private ObservableList<String> sublist;
    @FXML
    private ListView<String> listview_2;
    private ObservableList<String>sublist_2;
    
    
    /*@FXML private ListView <Button> listview;
    private ObservableList<Button> sublist;
    
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addData();
        // TODO
    } 
    private void addData(){
        sublist= FXCollections.observableArrayList();
        sublist.add(" ADMIN  ");
        sublist.add(" STUDENT  ");
        sublist.add(" TEACHER  ");
        sublist.add(" DEPARTMENT  ");
        sublist.add(" COURSE  ");
        
        listview.setItems(sublist);
        
        sublist_2= FXCollections.observableArrayList();
        sublist_2.add(" Student Information  ");
        sublist_2.add(" Teacher Information  ");
        sublist_2.add(" Admin Information  ");
        sublist_2.add(" Department Information  ");
        sublist_2.add(" Course Information  ");
        listview_2.setItems(sublist_2);
        
    }
    
}
