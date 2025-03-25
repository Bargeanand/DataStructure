import java.util.Scanner;
import java.util.ArrayList;
public class LonelyNumber1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();
        System.out.println("enter a size of arrayList");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a arrayListElement");
            List.add(sc.nextInt());
        }
      
        System.out.println("lonely number:");
        for(int i=0;i<List.size();i++)
        {
            boolean  lonly=true;
            for(int j=0;j<List.size();j++)
            {
              if(i!=j)  
              {
                if(List.get(i)==List.get(j)||List.get(i)==List.get(j)+1||List.get(i)==List.get(j)-1)
                {
                    lonly=false;
                    break;
                }
              }
            }
            if(lonly)
            {
                System.out.print(List.get(i)+" ");
                
            }
    }
}
}