import java.util.ArrayList;
import java.util.Scanner;
class ReverseArrayList{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a element you want to insert in ArrayList");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("entre a ArrayList element");
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        for(int i=0;i<size/2;i++)
        {
           int temp=list.get(i);
           list.set(i,list.get(size-i-1));
           list.set((size-i-1),temp);
        }
        System.out.println("reverse list");
        System.out.println(list);     //first approch
        for(int i=list.size()-1;i>=0;i--)
    {
        System.out.print(list.get(i)+" ");
    }
    System.out.println();   //second approtch
    }
   
    
}