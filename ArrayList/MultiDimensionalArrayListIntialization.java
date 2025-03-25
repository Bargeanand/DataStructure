import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimensionalArrayListIntialization1
{
    public static void main(String args[]){
   ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a size of MainList");
   int SizeOfMainList=sc.nextInt();
   ArrayList<Integer>list1=new ArrayList<>();
   System.out.println("enter a size of list1");
   int SizeOfList1=sc.nextInt();
   for(int i=0;i<SizeOfList1;i++){
    System.out.println("enter a element of list1");
    list1.add(sc.nextInt());
   }
   MainList.add(list1);
   ArrayList<Integer>list2=new ArrayList<>();
   System.out.println("enter a size of list2");
   int SizeOfList2=sc.nextInt();
   for(int i=0;i<SizeOfList2;i++)
   {
    System.out.println("enter a element of list2");
    list2.add(sc.nextInt());
   }
   MainList.add(list2);
   ArrayList<Integer>list3=new ArrayList<>();
   System.out.println("enter a size of list3");
   int SizeOfList3=sc.nextInt();
   for(int i=0;i<SizeOfList3;i++)
   {
    System.out.println("enter a element of list3");
    list3.add(sc.nextInt());
   }
   MainList.add(list3);
   System.out.println(MainList);
 
}
}
