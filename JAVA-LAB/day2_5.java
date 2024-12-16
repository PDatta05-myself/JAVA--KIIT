//Write a Java program to print a table of values of the function y = e^−x for x varying from 0 to 1 in steps of 0.1
import java.lang.Math;

public class day2_5 {
    public static void main(String[] args) {
    double y;
    System.out.println("NAME : PRIYANGSHU DATTA");
    System.out.println("ROLL NO. = 2330325 ");
        
 
    for(double i = 0; i <= 1; i = i + 0.1) {
    System.out.print(String.format("x= %.1f", i) + " ");
          
    y = Math.pow(Math.E, -i);
            
    System.out.print(String.format("y= %.3f", y) + " ");
    System.out.println();  
    }
    }
}

