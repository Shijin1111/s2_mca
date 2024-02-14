public class fact{
    public static void main(String args[]){
        int fact=0;
        int f=5;
        System.out.println(fact(f));
    }
    public static int fact(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
