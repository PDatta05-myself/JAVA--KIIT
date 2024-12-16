//Write a Java program to find the area and circumference of a circle, given its radius, r.
import java.util.Scanner;
public class prog3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        
        System.out.println("Enter the radius of the circle:");
        int r= sc.nextInt();
        double area = 3.14 * r * r;
        double circum=2*3.14*r;
        System.out.println("Area of the circle is: "+area);
        System.out.println("The circumference of the circle : "+(int)circum);
    }
}
