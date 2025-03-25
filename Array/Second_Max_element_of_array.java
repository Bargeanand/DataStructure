import java.util.Scanner;
class Second_Max_element_of_array
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a size");
    int size=sc.nextInt();
    byte a=true;
    int array[]=new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.println("enetr a array element");
        array[i]=sc.nextInt();
    }
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
  
    for(int i=0;i<size;i++)
    { 
        if(max1<array[i])
        {
            max2=max1;
            max1=array[i];
        }
        else if(max1>array[i]&& max2<array[i])
        {
            max2=array[i];
        }

    }
   if(max2==Integer.MIN_VALUE)
   {
      System.out.println("max1:"+max1);
   }
   else{
    System.out.println("max1 is:"+max1 +"max2 : "+max2);
   }
}
}