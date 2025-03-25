import java.util.Scanner;
class Insertion_sort
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
        for(int i=1;i<size;i++)
        {
          for(int j=i;j>0;j--)
          {
            if(array[j-1]>array[j])
            {
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;

            }
          }
        }
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