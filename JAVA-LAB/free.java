import java.util.*;
public class free {
    public static void main(String[] args){
        // to find armstrong number
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=x;
        int b=0;
        while(a!=0){
            int c = a%10;
            b = b+(c*c*c);
            a=a/10;
        }
        if(b== x ){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not armstrong");
        }
    }
}
