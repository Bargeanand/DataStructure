import java.util.Scanner;
class Reverse_The_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("eneter a array element");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size/2;i++)
        {
           
            int temp=array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
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
        System.out.print("]");
    }
}