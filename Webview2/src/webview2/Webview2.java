/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webview2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Webview2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        WebView webview = new WebView();
        VBox vbox=new VBox(webview);
        webview.setMinSize(100,100);
        webview.getEngine().load("https://www.google.com");
       /* btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                webview.getEngine().load("https://www.google.com");
            }
        });*/
        
        StackPane root = new StackPane();
        root.getChildren().addAll(vbox);
        
        Scene scene = new Scene(root, 500, 550);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
