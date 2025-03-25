import java.util.Scanner;
class Anand_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        int p=0;
       // int temp=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        { 
            int temp=Integer.MAX_VALUE;
            if(i<size-1)
            {
            for(int j=i+1;j<size;j++)
             {
                if(temp>array[j])
                {
                    temp=array[j];
                }
             }
           for(int k=0;k<=i;k++)
           { 
            p++;
              if(array[k]>temp)
              {
                int temp1=array[k];
                array[k]=temp;
                for(int l=k;l<size-1;l++)
                {
                    if(array[l+1]!=temp){
                    int temp2=array[l+1];
                    array[l+1]=temp1;
                    temp1=temp2;
                    }
                    if(array[l+1]==temp)
                    {
                      
                            int temp2=array[l+1];
                            array[l+1]=temp1;
                            temp1=temp2;
                            break;
                           
                }
              }
           }
           else
           {
            if(p==i){
               for(int l=k;l<size-1;l++)
               {
                    int temp1=array[l+1];
                    array[l+1]=temp;
                    for(int m=l;m<size-1;m++)
                    {
                        if(array[m+1]==temp)
                        {
                           p=0;
                            break;
                        }
                        else{
                            int temp2=array[m+1];
                            array[m+1]=temp1;
                            temp1=temp2;
                        }
                    }
                    break;
               }
           }
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
    

}
}