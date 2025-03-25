import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class LonelyNumber2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();
        System.out.println("enter a size of arrayList");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a arrayList element");
            List.add(sc.nextInt());
        }
       
        Collections.sort(List);
        int start=0,end=1;
        boolean lonely=false;
        System.out.print("lonely number:");
        while(start<size)
        {
           if(start==0)
           {
               if(List.get(start)==List.get(end)||List.get(start)+1==List.get(end))
               {
                    lonely=true;
               }
           }
           else if(start>0 && start<size-1)
           {
            if(List.get(start)==List.get(end)||(List.get(start)+1==List.get(end))||List.get(start-1)==List.get(start)-1||List.get(start)==List.get(start-1))
            {
                lonely=true;
            }
           }
           else if(start==size-1){
                if(List.get(start)==List.get(start-1)+1)
                {
                    lonely=true;
                }
           }
           if(lonely==false)
           {
            System.out.print(List.get(start));
          
           }
           start++;
           end++;
           lonely=false;

        }
}
}