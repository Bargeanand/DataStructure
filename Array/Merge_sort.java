import java.util.Scanner;
class Merge_sort
{
    static Scanner sc=new Scanner(System.in);
    public static int []arrayinput(int array[],int size,Scanner sc)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("enter A array element");
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static void divid_array(int array[],int start,int end)
    {
        if(start<end){
        int divide=start+((end-start)/2);
        divid_array(array,start,divide);
        divid_array(array,divide+1,end);
        concur_array(array,divide,start,end);
        }
    }
    public static void concur_array(int array[],int divide,int start,int end)
    {
        int n1=divide+1-start;
        int n2=end-divide;
        int left_array[]=new int[n1];
        int right_array[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left_array[i]=array[start+i];
        }
        for(int i=0;i<n2;i++)
        {
            right_array[i]=array[divide+1+i];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2 )
        {
            if(left_array[i]<=right_array[j])
            {
                array[k]=left_array[i];
                i++;
            }
            else{
                array[k]=right_array[j];
                j++;
            }
            k++;
        }   
        while(i<n1)
        {
            array[k]=left_array[i];
            i++;
            j++;
        }
        while(j<n2)
        {
            array[k]=right_array[j];
            j++;
            k++;
        }
    }
    public static void main(String args[])
    {
        System.out.println("enter a size");
        int size=sc.nextInt();
        int array[]=new int[size];
        arrayinput(array,size,sc);
        divid_array(array,0,size-1);
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]);
            if(i<size-1)
            {
                System.out.print(",");
            }
        }
    }
}
