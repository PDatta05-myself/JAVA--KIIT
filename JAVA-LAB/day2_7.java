//Write a program to check whether a number is armstrong number or not
import java.util.Scanner;
public class day2_7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NAME : PRIYANGSHU DATTA");
    System.out.println("ROLL NO. = 2330325 ");
    System.out.println("Enter a number to check= ");
    int n=sc.nextInt();
    int sum=0;
    int temp=n;
    while(temp!=0)
    {
        int r=temp%10;
        sum=sum+(r*r*r);
        temp=temp/10;
    }
    if(n==sum)
    {
        System.out.println(n+" is an Armstrong number");
    }
    else
    {
        System.out.println(n+" is not an Armstrong number");
    }
}

    
}
