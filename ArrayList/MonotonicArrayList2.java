import java.util.Scanner;
import java.util.ArrayList;
public class MonotonicArrayList2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of arrayList");
        int Size=sc.nextInt();
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=0;i<Size;i++)
        {
            System.out.println("enter a arrayList element");
            List.add(sc.nextInt());
        }
        System.out.println(List);
        int i=0;
        int increasing=0,decresing=0;
        while(i<List.size()-1)
        {
            if(List.size()<=1)
            {
                System.out.println("List is Monotonic");
                break;
            }
            if(List.get(i)>=List.get(i+1))
            {
                
                increasing++;
            }
            if(List.get(i)<=List.get(i+1))
            {
                decresing++;
            } 
            i++;
        }
        if(increasing==List.size()-1||decresing==List.size()-1)
        {
            System.out.println("List is Monotonic");
        }
        else
        {
            System.out.println("List is not Monotonic");
        }



    }
}