public class fibo{
    public static void main(String args[]){
        int n=10;
        fib(n); 
    }
    public static void fib(int n){
        int a=0;
        int b=1;
        int c;
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(a);
            System.out.println(b);
            for(int i=2;i<10;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;

            }
        }
    }
}