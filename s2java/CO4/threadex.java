import java.util.Scanner;
class mul extends Thread
{
    public void run()
    {
        System.out.print("enter the number don't mind");
        int x=239;
        for(int i=0;i<x;i++)
        {
            System.out.println("5*"+i+"="+(5*i));
        }
    }
}
class some extends Thread{
    public void run() {
        int count = 0, i = 1, j, n, no = 0;
        Scanner sc = new Scanner(System.in);
        // System.out.println("\n\nEnter value for N :");
        n = 56;
        System.out.println("Prime Numbers are :");
        while (no != n) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + "   ");
                no++;
            }
            i++;
        }
    }
}
class threadex{
    public static void main(String args[])
    {
        some s=new some();
        s.start();
        mul m=new mul();
        m.start();
    }
}