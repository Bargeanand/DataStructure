import java.util.Scanner;
import java.util.ArrayList;
class ArrayListSortingUsingInsertionSort
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array size");
        int size=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a arraylistb elemnt");
            list.add(sc.nextInt());
        }
        for(int i=1;i<list.size();i++)
        {
            int key=list.get(i);
            int j=i-1;
            {
                list.set(j+1,list.get(j));
                j--;
        } list.set(j+1,key);

    }
    System.out.println(list);
    sc.close();
    }
}