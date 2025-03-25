import java.util.Scanner;
import java.util.ArrayList;
public class LonelyNumber
{
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a ArrayList element");
            List.add(sc.nextInt());
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(List.get(j)==List.get(i)-1||List.get(j)==List.get(i)+1)
                {
                    break;
                }
                if(j==size-1)
                {
                    System.out.print(List.get(i)+" ");
                }
            }
        }
    }
}