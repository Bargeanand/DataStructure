import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class ArrayListSortingUsingCountSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of arraylist");
        int size=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a element of arraylsit");
            list.add(sc.nextInt());
        }
        System.out.println("before sorting ArrayList is:"+list);
        int min=Collections.min(list);
        int max=Collections.max(list);
        int range=0;
        range=max-min+1;
        ArrayList<Integer>CountListElementAccordingToIndex=new ArrayList<>();
        for(int i=0;i<range;i++)
        {
            CountListElementAccordingToIndex.add(0);
        }  
        for(int i=0;i<list.size();i++)
        {
            CountListElementAccordingToIndex.set(((list.get(i))-min),CountListElementAccordingToIndex.get((list.get(i))-min)+1);
        }
        System.out.println("CountListElementAccordingToIndex:"+CountListElementAccordingToIndex);
        int i=0;
        int j=0;
        while(i<list.size())
        {
            if(CountListElementAccordingToIndex.get(j)!=0){
                list.set(i,(j+min));
                CountListElementAccordingToIndex.set(j,(CountListElementAccordingToIndex.get(j)-1));
                i++;
            }
            if(CountListElementAccordingToIndex.get(j)==0){
                j++;
            }
        }
        System.out.println("after sorting ArrayList:"+list);
        }
}