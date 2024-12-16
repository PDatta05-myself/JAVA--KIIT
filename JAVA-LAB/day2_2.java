public class day2_2 {
    public static void main(String args[])
    {
        System.out.println("NAME : PRIYANGSHU DATTA");
        System.out.println("ROLL NO. = 2330325 ");
        int a=50,b=60,c=70;
        boolean x,y,z;
        System.out.println();
        System.out.println("a=c"+a+"b="+b+"c="+c);
        System.out.println();
        System.out.println("Working of relational operators");
        System.out.println();
        x=(a<b)||(a>c);
        System.out.println("(a<b) || (a>c) is"+x);
        y=(a<b)&&(a>c);
        System.out.println("(a<b) && (a>c) is"+y);
        z=!(b>c);
        System.out.println("!(b>c) is"+z);
    }
}
