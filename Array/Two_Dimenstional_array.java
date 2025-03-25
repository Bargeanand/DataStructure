import java.util.Scanner;
class Two_Dimenstional_array_Declaration_Intialization_Insertion_of_value
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no of row");
        int row=sc.nextInt();
        System.out.println("enter a no of col");
        int col=sc.nextInt();
        int array[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("enter a array element");
                array[i][j]=sc.nextInt();
            }
        }
       
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j]);
                if(j<col-1){
                    System.out.print(",");
                }
                
            }
            System.out.println();
        }
    }
}