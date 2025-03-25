import java.util.Scanner;
import java.util.ArrayList;
class MaxElementOfArrayList{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter a size of ArrayList");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
        }
        System.out.println("max element is:"+max);

    }
}