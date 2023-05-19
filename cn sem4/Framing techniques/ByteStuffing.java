import java.util.*;

public class ByteStuffing 
{
    
    static void ByteStuffing(String f,String m)
    {
        String stuffed=m.replaceAll(f,"ESC"+f);

        System.out.println("FLAG "+stuffed+" FLAG");
    }
    
    
    
    public static void main(String args[])
    {
            Scanner sc= new Scanner(System.in);
            String flag="01111110";
            System.out.print("Enter the message: ");
            String message =sc.nextLine();
            ByteStuffing(flag,message);
    }    
}
