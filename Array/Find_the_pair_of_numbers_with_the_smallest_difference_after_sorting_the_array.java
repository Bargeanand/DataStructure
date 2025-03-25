import java.util.Scanner;
class Find_the_pair_of_numbers_with_the_smallest_difference_after_sorting_the_array
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

        //bubble sort:
        for(int i=0;i<size;i++)
        {
          
            for(int j=0;j<size;j++)
            {
                if(j<size-1)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];            //insted of these directly use array.sort() function
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
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
        int difference=Integer.MAX_VALUE;
        int i=0,j=i+1;
        int k=Integer.MAX_VALUE;
        int m=Integer.MAX_VALUE;
        while(i<size)
        {
            if(j<size){
            if(difference>(array[j]-array[i]))
            {
                difference=array[j]-array[i];
                k=i;
                m=j;
                
            }
            j++;
        }
        else
        {
            i++;
            j=i+1;
        }
        }
        
        System.out.println("differnce is: "+difference);
        System.out.println("smallest differnce pair are ("+array[k]+","+array[m]+")");
    }
}
