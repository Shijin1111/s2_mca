public class pal {
    public static void main(String args[])
    {
        int number=232;
        int num=number;
        int rev=0,rem;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println("reverse of number"+rev);
        if(number==rev)
        {
            System.out.println(number+"is pallindrom");
        }
        else
        {
            System.out.println(number+"is not a pallindrom");
        }
    }
}
