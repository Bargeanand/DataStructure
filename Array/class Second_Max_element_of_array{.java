import java.utll.Scanner;
class Second_Max_element_of_array{
public static vodi main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.pritnln("enetr a array element");
        array[i]=sc.nextInt();
    }
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
    for(int i=0;i<size;i++)
    {
        if(max1<array[i])
        {
            max1=array[i];
        }
    }
    for(int i=0;i<size;i++)
    {
        if(max2<array[i]&&max2<max1)
        {
            max2=array[i];
        }
    }
    System.out.println("max1 is"+max1+"/nmax2 is"+max2);
}
}