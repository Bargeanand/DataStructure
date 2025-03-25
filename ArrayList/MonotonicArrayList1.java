import java.util.Scanner;
import java.util.ArrayList;
public class MonotonicArrayList1
{
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of List");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array list element");
            List.add(sc.nextInt());
        }
        boolean monotonic=isMonotonic(List);
        if(monotonic==true)
        {
            System.out.println("List is Monotonic");
        }
        else{
            System.out.println("List is not monotonic");
        }
    }
    public static boolean isMonotonic(ArrayList<Integer>List)
    {
        boolean increasing=true,decreasing=true;
        for(int i=1;i<List.size();i++)
        {
            if(List.get(i)<List.get(i-1))
            {
                increasing=false;
            }
            if(List.get(i)>List.get(i-1))
            {
                decreasing=false;
            }
        }
            return increasing||decreasing;
    }

}