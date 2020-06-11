/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginsystem;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class AddingData {
    public static void display(){
        Stage window=new Stage();//empty window
        window.setTitle("Sucessful");
        
        HBox root=new HBox();
        Button btn =new Button("OK");
        Label lbl=new Label ();
        lbl.setText("Username and Password is Correct");
        btn.setOnAction(e -> window.close());
        root.getChildren().addAll(btn,lbl);
        Scene scene = new Scene(root,500,500);
        window.setScene(scene);
        window.show();
        
    }
    
}
