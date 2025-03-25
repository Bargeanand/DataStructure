import java.util.Scanner;
class Two_Dimenstional_Matrix_Sparse_Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a row");
        int row=sc.nextInt();
        System.out.println("enter a col");
        int col=sc.nextInt();
        int matrix[][]=new int [row][col];
        int zero_count=0;
        int total_element=0;
        m=row*col;
      
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("enter a matrix element");
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==0)
                {  
                    zero_count++;
                }
            }
        }
        total_element=total_element-zero_count;
     
        if(zero_count>total_element)
        {
            System.out.println("matrix is parse matrix");
        }
        else{
            System.out.println("matrix is  not parse matrix");
        }
    }
}