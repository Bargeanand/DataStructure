import java.util.Scanner;
import java.util.ArrayList;
class ArrayListSortingByUsingBubbleSort
{
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of arraylist");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a arraylist elemnt");
            list.add(sc.nextInt());
        }
        int swap;
        for(int i=0;i<list.size()-1;i++)
        {
           swap=0;   
            for(int j=0;j<list.size()-1-i;j++)
            {

                if(list.get(j)>list.get(j+1))
                {
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                    swap++;
                }
            }
        if(swap==0){
           
            break;
        }
    }
    System.out.println(list);
    sc.close();
    }

}