import java.util.ArrayList;
import java.util.Scanner;
class ArrayListOperation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("enter a array list element");
            int x=sc.nextInt();
            list.add(x);
        }
        System.out.println(list);
        System.out.println("enter a key you want to search");
        int key=sc.nextInt();
        int key_found=0;
        for(int i=0;i<list.size();i++)
        {
            if(key==list.get(i))
            {
                key_found++;
            }
        }
        if(key_found>0)
        {
            System.out.println("key found");
        }
        else
        {
            System.out.println("key is not found");
        }
        list.set(2,7);
        System.out.println(list);
        System.out.println(list.contains(2));
    }
}