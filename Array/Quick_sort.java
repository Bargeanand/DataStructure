import java.util.Scanner;
class Quick_sort
{
    static Scanner sc=new Scanner(System.in);
    public static int[] arrayinput(int array[],int size,Scanner sc)
    {
        for(int i=0;i<size;i++)
        {
        System.out.println("enter a array element");
        array[i]=sc.nextInt();
        }
        return array;
    }
    public static int partitation(int array[],int start,int end)
    {
        int pivot=start;
        while(start<end) 
        {
            while(start<=end && array[pivot]>=array[start])
            {
                start++;
            }
            while(start<=end && array[pivot]<array[end])
            {
                end--;
            }
            if(start<end)
            {
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
            }
        }
        int temp=array[pivot];
        array[pivot]=array[end];
        array[end]=temp;
        return end;
}
    public static void quick_sort(int array[],int start,int end)
    {
        if(start<end){
        int pivotindex=partitation(array,start,end);
        quick_sort(array,start,pivotindex-1);
        quick_sort(array,pivotindex+1,end);
    }
    }
    public static void main(String args[])
    {
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        arrayinput(array,size,sc);
        quick_sort(array,0,size-1);

        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
            if(i<size-1)
            {
                System.out.print(",");
            }

        }
        System.out.println("]");
    }
}

