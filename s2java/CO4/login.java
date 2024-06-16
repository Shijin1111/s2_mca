import java.util.*;
class myexc extends Exception
{
    public myexc(String msg)
    {
        super(msg);
    }
}
public class login{
    String name;
    String pswd;
    String oname="shijin";
    String opswd="mypswd";
    public login(String n,String p)
    {
        this.name=n;
        this.pswd=p;
    }
    public void check()throws myexc
    {
        if (!name.equals(oname) || !pswd.equals(opswd))
        {
            throw new myexc("invalid login credentials");
        }
    }
    public static void main(String args[])
    {
        login l=new login("sh","dh");
        try{
            l.check();
        }
        catch(myexc e)
        {
            System.out.println(e.getMessage());
        }
    }
}