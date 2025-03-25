import java.util.*;
class Two_Dimentional_Array_Transpose
{
    public static void main(String args[])throws ArrayIndexOutOfBoundsException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no of rows");
        int row=sc.nextInt();
        System.out.println("enter a no of col");
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("enter a matrix elemnt");
                matrix[i][j]=sc.nextInt();
            }
        }
         System.out.println("before sorting");
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
        System.out.println();
        if(col==row){
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j!=0 && i!=j && i<j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        } System.out.println("after sorting");
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
        }
    }
    else
    {
        int Transpose_Matrix[][]=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                Transpose_Matrix[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(Transpose_Matrix[i][j]);
                if(j<col-1)
                {
                    System.out.print(",");
                }  
            }
            System.out.println();
        }
        
        }
    
}

}