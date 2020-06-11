/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class main {
    public float calculate(long num1,long num2,String Operator) {
        switch(Operator){
            case "+" : {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num1+num2);
                return num1+num2;
            }
            case "-" : {
                return num1-num2;
            }
            case "*" : {
                return num1*num2;
            }
            case "/" : {
                if (num2==0)return 0;
                        else { return num1/num2;}
            }
            default :{
                return 0;
            }
            
        }
}
    
}
