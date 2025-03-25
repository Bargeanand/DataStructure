import java.util.Scanner;
import java.util.ArrayList;
class SwapElementOfArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of ArrayList");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int temp=list.get(1);
        list.set(1,list.get(3));
        list.set(3,temp);
        System.out.println(list);
    }
}