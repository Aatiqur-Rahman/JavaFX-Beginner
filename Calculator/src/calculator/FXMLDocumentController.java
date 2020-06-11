/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.Long.parseLong;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label result;
    private long num1=0;
    private long num2=0;
    private String Operator="";
    private main Main=new main();
    
    
    @FXML
    private void processOperand(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        result.setText(result.getText()+ value);
        
    }
    @FXML
    private void processOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!value.equals("=")){
            if (!Operator.isEmpty())return ;
            Operator=value;
            num1=Long.parseLong(result.getText());
            result.setText("");
        }
        else{
            num2=Long.parseLong(result.getText());
            float output=Main.calculate(num1,num2,Operator);
            System.out.println(output);
            result.setText(String.valueOf(output));
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
