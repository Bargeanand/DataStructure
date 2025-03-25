import java.util.Scanner;
class Best_solution_of_count_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
          System.out.println("enter a array element");
            array[i]=sc.nextInt();
            if(max<array[i])
            {
                max=array[i];
            }
            if(min>array[i])
            {
                min=array[i];
            }
        }
          max=max-min;
        int count_array[]=new int[max+1];
             for(int i=0;i<size;i++)
             {          
                 count_array[array[i]-min]=count_array[array[i]-min]+1;  
             }
          int i=0,j=0;     
          while(i<max+1)
          {
            if(count_array[i]!=0 )
              {
                array[j]=i+min; 
                j++;
                count_array[i]--;
              }
            if(count_array[i]==0)
             {
                 i++;
             }
         }
       
       System.out.print("[");
       for(int k=0;k<size;k++)
       {
          System.out.print(array[k]);
          if(k<size-1)
          {
            System.out.print(",");
          }  
       }
       System.out.print("]");
       sc.close();
    }
  }

