/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    /**
     *
     */
    //@FXML
    //private ListView <?> listview;
    @FXML private ListView <Button> listview;
    @FXML
    private Button button_1;
    @FXML
    private Button button_2;
    @FXML
    private Button button_3;
    
    Button button1=new Button("OK");
    
    ObservableList<Button> list =observableArrayList();
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        add();
    }
    private void add(){
        list=FXCollections.observableArrayList();
        list.add(button1);
        //list.add(button_1);
        //list.add(button_2);
        //list.add(button_3);
        
        listview.setItems(list);
    }
    
}
