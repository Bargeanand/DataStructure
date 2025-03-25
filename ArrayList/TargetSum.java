import java.util.Scanner;
import java.util.ArrayList;
public class TargetSum{
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        boolean flag=true;
        System.out.println(List);
        // for(int i=0;i<List.size()-1;i++)
        // {
        //     for(int j=i+1;j<List.size();j++)
        //     {
        //         if(List.get(i)+List.get(j)==5)
        //         {
        //             System.out.println("first element:"+i+" second element:"+j);
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag==false)
        //     {
        //         break;
        //     }
        // }
        for(int x1:List)
        {
            System.out.println(x1);
        }
    
    }
}