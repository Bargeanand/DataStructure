import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class SortingArrayList{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter a size of arraylist");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        // for(int i=0;i<size;i++)
        // {
        //     for(int j=i;j<size;j++)
        //     {
        //         if(list.get(i)>list.get(j))
        //         {
        //             int temp=list.get(i);
        //             list.set(i,list.get(j));                              //First approtch
        //             list.set(j,temp);
        //         }
        //     }
        // }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}