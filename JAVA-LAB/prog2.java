//Write a Java program to print the following on the console: “Name” “Roll number” “Branch” “Department” “University”
import java.util.Scanner;
public class prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        System.out.println("ENTER THE NUMBER OF STUDENT DATA TO TAKE:");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            System.out.println("ENTER THE DETAILS:");
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Roll Number: ");
            int roll_no = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Branch: ");
            String branch = sc.nextLine();
            
            System.out.print("Department: ");
            String dept = sc.nextLine();
            
            System.out.print("University: ");
            String univ = sc.nextLine();
            
            System.out.println("\nSTUDENT DETAILS:");
            System.out.println("NAME=" + name);
            System.out.println("ROLL NUMBER=" + roll_no);
            System.out.println("BRANCH=" + branch);
            System.out.println("DEPARTMENT=" + dept);
            System.out.println("UNIVERSITY=" + univ);
            System.out.println(); 
        }
    }
}