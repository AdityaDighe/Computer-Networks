import java.util.*;

public class BitStuffing 
{
    
    static void BitStuffing(String f,String m)
    {
        String Flag="01111110";
        String stuffed=m.replaceAll(f,f+"0");

        System.out.println(Flag+" "+stuffed+" "+Flag);
    }
    
    
    
    public static void main(String args[])
    {
            Scanner sc= new Scanner(System.in);
            String f="011111";
            System.out.print("Enter the message: ");
            String message =sc.nextLine();
            BitStuffing(f,message);
    }    
}
