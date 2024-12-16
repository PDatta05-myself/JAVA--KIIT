//Write a Java program to generate a Fibonacci series.
import java.util.Scanner;
public class day2_8 {
    public static void main(String[] args) {
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        System.out.println("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            }
        }
                
    }
}
