import java.util.Scanner;
class Count_sort
  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        int max=Integer.MIN_VALUE;
       // int min=Integer.MAX_VALUE;       //n
        for(int i=0;i<size;i++)
        {
            System.out.println("enter a array element");
            array[i]=sc.nextInt();
            if(max<array[i])
            {
                max=array[i];
            }
            // if(min>array[i])
            // {
            //     min=array[i];
            // }
        }
        int count_array[]=new int[max+1];
        // for(int i=0;i<max+1;i++)            //i=0
        // {
        //     count_array[i]=0;
        // }
        for(int i=0;i<size;i++)
        {
            int z=0;
            int count=0;
            for(int j=i;j<size;j++)
            {
                if(j-i<i){
                if(array[i]==array[j-i])
                {
                    z++;
                }
                }
            }
            for(int k=array[i];k<max+1;k++)
            {
                  
                if(z>0)
                {
                    break;
                }
                for(int j=i;j<size;j++)
                {
                if(k==array[j])
                {
                    count++;
                }
                }
            count_array[k]=count;
            if(count>0)
            {
                break;
            }
            }
        }
        int k=0;          //k=0
        int i=0;
        int m;
        while(k<max+1)
        {   m=0;
           while( i<size){
                if(count_array[k]>0)
                {   m++;
                    array[i]=k;
                    count_array[k]--;
                    if(count_array[k]>0)
                    {
                    i++;
                    }
                    if(count_array[k]==0)
                    {
                        break;
                    }
                }
                if(count_array[k]==0)
                {   
                    
                    break;
                }
           }
           if(m!=0){
            i++;
        }
            k++;
        }
        System.out.print("[");
        for(int y=0;y<size;y++)
        {
            System.out.print(array[y]);
            if(y<size-1)
            {
                System.out.print(",");
            }
            
        }
        System.out.print("]");
}

}
