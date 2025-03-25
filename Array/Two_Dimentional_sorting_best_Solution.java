import java.util.*;
class Two_Dimentional_sorting_best_Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre a no of rows");
        int row=sc.nextInt();
        System.out.println("enter a no of col");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            Arrays.sort(matrix[i]);
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]);
                if(j<col-1)
                {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}