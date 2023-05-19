import java.util.*;

public class ChatacterCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the messages : ");
        String[] str=new String[3];
        int[] arr=new int[3];

        for(int i=0;i<3;i++)
        {
            str[i]=sc.nextLine();
            arr[i]=str[i].length()+1;
        }

        System.out.print("The Frame is : ");
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+str[i]);
        }
    }
}
