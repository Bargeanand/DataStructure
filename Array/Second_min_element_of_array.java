import java.util.Scanner;
class Second_min_element_of_array        // another solution first sort array in accending order nad then print first and second element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array element");
            array[i]=sc.nextInt();
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(min1>array[i])
            {
                min2=min1;
                min1=array[i];
            }
            else if(min1<array[i] && min2>array[i])
            {
                min2=array[i];
            }
        }
        if(min2==Integer.MAX_VALUE)
        {
            System.out.println("min1 :"+min1);
        }
        System.out.println("min1 is: "+min1+"\nmin2 is: "+min2);

    }
}