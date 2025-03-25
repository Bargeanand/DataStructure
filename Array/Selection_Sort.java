import java.util.Scanner;
class  Selection_Sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("orignal array");
        System.out.println("");
        System.out.print("[");
        for(int k=0;k<size;k++)
        {
            System.out.print(array[k]);
            if(k<size-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++){
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
                System.out.println("after "+(i+1)+" iteration");
                System.out.println("");
               System.out.print("[");
                for(int k=0;k<size;k++)
                {
                    System.out.print(array[k]);
                    if(k<size-1)
                    {
                        System.out.print(",");
                    }
                }
                System.out.println("]");
                System.out.println("");
        }
       
    }
}