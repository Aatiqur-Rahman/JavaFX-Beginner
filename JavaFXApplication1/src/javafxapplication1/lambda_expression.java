/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lambda_expression extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn=new Button("Click Me!!");
        btn.setOnAction(e -> System.out.println("Hello World !!"));
        HBox root = new HBox();
        root.getChildren().add(btn);
        Scene scene=new Scene (root,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lambda Expression");
        primaryStage.show();
    }
    public static void main (String args[]){
        launch(args);
    }
    
}