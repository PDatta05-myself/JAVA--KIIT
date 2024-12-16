//Write a Java program to accept the number of seconds and display its equivalent number of hours, number of minutes and number of seconds
import java.util.Scanner;
public class prog4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        
        System.out.println("Enter the number of seconds:");
        int n=sc.nextInt();
        int h=n/3600;
        int m=(n%3600)/60;
        int s=n%60;
        System.out.println(n+" seconds is equal to "+h+" hours "+m+" minutes and "+s+"seconds");
    }
}
