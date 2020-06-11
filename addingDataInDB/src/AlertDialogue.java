/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AlertDialogue {
    public static void display(String Title,String msg){
        // Empty Stage
        Stage window = new Stage();
        window.setTitle(Title);
        
        
        HBox root = new HBox();
        Button btn = new Button("OK");
        btn.setOnAction(e -> window.close());
        Label label =new Label();
        label.setText(msg);
        root.getChildren().addAll(btn,label);
        Scene scene = new Scene(root,250,250);
        


//Initilize scene and show
        window.setScene(scene);
        window.showAndWait();
    }
}
