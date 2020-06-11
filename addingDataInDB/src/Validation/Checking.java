/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Checking {
    public static boolean isempty(TextField tf){
        return  tf.getText().length()!=0 || !tf.getText().isEmpty();
    }    
    public static void isempty(TextField tf,Label status,String msg){
        boolean t= isempty(tf);
        tf.getStyleClass().remove("error");
        if (false==t){
            tf.getStyleClass().add("error");
            status.setText(msg);
        }
    }
}
