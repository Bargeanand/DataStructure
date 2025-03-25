class Two_Dimenstional_Matrix_Sparse_Matrix
{
    public static vodi main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a row");
        int row=sc.nextInt();
        Sysetm.out.println("enter a col");
        int col=sc.nextInt();
        int matrix[][]=new int [row][col];
        int k=0;
        int m=0;
        if(row>=col)
        {
            m=row*row;
        }
        else{
            m=col*col;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("enter a matrix element");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    k++;
                }
            }
        }
        if(k>m)
        {
            System.out.println("matrix is parse matrix");
        }
        else{
            System.out.println("matrix is  not parse matrix");
        }
    }
}