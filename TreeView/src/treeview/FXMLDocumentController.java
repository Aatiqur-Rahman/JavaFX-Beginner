/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.*;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    ListView<String> tree;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem <String> root = new TreeItem("Root");
        TreeItem <String> NodeA= new TreeItem("NodeA");
        TreeItem <String> NodeB= new TreeItem("NodeB");
        TreeItem <String> NodeC= new TreeItem("NodeC");
        root.getChildren().addAll(NodeA,NodeB,NodeC);
        tree.setRoot(root);
        
    }    
    
}
