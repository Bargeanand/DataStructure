import java.util.Scanner;
import java.util.ArrayList;
public class MonotonicArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            List.add(sc.nextInt());
        }
        boolean monotonic=isMonotonic(List);

        if(monotonic==true)
        {
            System.out.println("List is Monotonic");
        }
        else{
            System.out.println("List is not Monotonic");
        }
    }
    public static boolean isMonotonic(ArrayList<Integer>List)
    {
        int  increasing=0;
        int decreasing=0;
        for(int i=0;i<List.size()-1;i++)   
        {
            if(List.get(i)<=List.get(i+1))
            {
                increasing++;
            }
            if(List.get(i)>=List.get(i+1))
            {
                decreasing++;
            }
        }   
        if(increasing==List.size()-1 || decreasing==List.size()-1 )  
        {
            return true;
        }
        else{
            return false;
        }
    }
}