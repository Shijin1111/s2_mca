import java.util.*;
public class complexSum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int r1,r2,r3,i1,i2,i3;
        System.out.println("enter the real part of number1");
        r1=s.nextInt();
        System.out.println("enter the imaginary part of number1");
        i1=s.nextInt();
        System.out.println("enter the real part of number2");
        r2=s.nextInt();
        System.out.println("enter the imaginary part of number2");
        i2=s.nextInt();
        r3=r1+r2;
        i3=i1+i2;
        System.out.println("the sum of the numbers="+r3+"+"+i3+"i");


    }
}
