/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ManysceneController implements Initializable {

    @FXML
    private ListView<String> listview;
    private ObservableList<String> sublist;
    @FXML
    private TabPane maintab;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addDataTolistview();
        addtabtolistview();
    } 
    private void addDataTolistview(){
        sublist= FXCollections.observableArrayList();
        sublist.add("scene_1");
        sublist.add("Scene_2");
        listview.setItems(sublist);
    }
    private void addtabtolistview(){
    listview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int i=listview.getSelectionModel().getSelectedIndex();
            if (i==0){
                try {
                    Node Scene_1=FXMLLoader.load(getClass().getResource("/Loading/sample.fxml"));
                    Tab tab= new Tab("Scene_1",Scene_1);
                    maintab.getTabs().add(tab);
                    
                } catch (IOException ex) {
                    Logger.getLogger(ManysceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (i==1){
                
            }
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    });
    }
    
}
