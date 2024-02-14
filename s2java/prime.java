class prime
{
    public static void main(String args[])
    {
        int p=14;
        if(p<=1)
        {
            System.out.println(p +"is not a prime number");
        }
        else
        {  
            int k=0;
            for(int i=2;i<=p/2;i++)
            {
                if(p%i==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(p +"is a prime number");
            }
            else
            {
                System.out.println(p +"is not a prime number");
            }
        }
    }
}