import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimensionalArrayListIntialization2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
       System.out.println("enter a size of ArrayList");
       int MainSize=sc.nextInt();
       System.out.println("enter a size of SubLists");
       int SubSize=sc.nextInt();
       ArrayList<Integer>List1=new ArrayList<>();
       ArrayList<Integer>List2=new ArrayList<>();
       ArrayList<Integer>List3=new ArrayList<>();
       for(int i=0;i<MainSize;i++){
            System.out.println("enter a "+i+" index element of List1");
            List1.add(sc.nextInt());
            System.out.println("enter a "+i+" index element of List2");
            List2.add(sc.nextInt());
            System.out.println("enter a "+i+" index element of List3");
            List3.add(sc.nextInt());
       }
       MainList.add(List1);
       MainList.add(List2);
       MainList.add(List3);
       System.out.println(MainList);
    }
}