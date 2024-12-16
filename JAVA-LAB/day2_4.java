//Write a Java program to find the largest of three numbers using a conditional operator.
import java.util.Scanner;
public class day2_4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NAME : PRIYANGSHU DATTA");
    System.out.println("ROLL NO. = 2330325 ");
    System.out.println("Enter the first integer: ");
    int a = sc.nextInt();
    System.out.println("Enter the second integer: ");
    int b = sc.nextInt();
    System.out.println("Enter the third integer: ");
    int c = sc.nextInt();

 
    int largest = (c > ((a > b) ? a : b)) ? c : ((a > b) ? a : b);
    System.out.println("Largest=" + largest);
    }
}


