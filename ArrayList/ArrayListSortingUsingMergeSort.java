import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListSortingUsingMergeSort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("enter a size of arraylist");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("entre a arraylist elemnt");
            list.add(sc.nextInt());
        }
        DivideArrayList(list,0,list.size()-1);

    }
    public static void DivideArrayList(ArrayList<Intger>list,int start,int end)
    {
        if(start<end){
        int mid=start+(end-start)/2;
        DivideArrayList(list,start,mid);
        DivideArrayList(list,mid+1,end)
        MergeArrayList(list,mid,start,end)
    }
    }
    public static void MergeArrayList(ArrayList<Integer>list,int mid,int start,int end){
        int sizeofleftlist=mid+1-start;
        int sizeofrightlist=end-mid;
        ArrayList<Integer>LeftList=new ArrayList<>();
        ArrayList<Integer>RighttList=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<sizeofleftlist && j<sizeofrightlist){
            if(LeftList.get(i)<=RighttList.get(j)){
                list.set(k,LeftList.get(i));
                i++;
            }
            else{
                list.set(k,RighttList.get(j));
                j++;
            }
            k++;
        }
        while(j<sizeofrightlist){
            list.set(k,RighttList.get(j));
            j++;
            k++;
        }
        while(i<sizeofleftlist){
            list.set(k,LeftList.get(i));
            i++;
            k++;
        }


    }
}