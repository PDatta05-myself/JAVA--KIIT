//Write a Java program to accept the length and breadth of a rectangle and display its area and perimeter.
import java.util.Scanner;
public class prog5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        
        System.out.println("Enter the length of the rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b = sc.nextInt();
        int area = l * b;
        int perimeter = 2 * (l + b);
        System.out.println("The area of the rectangle is: "+area);
        System.out.println("The perimeter of the rectangle is: "+perimeter);
        
    }
}
