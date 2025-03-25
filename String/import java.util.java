import java.util.Scanner;
class Finding_Shortest_Path_Between_Direction
{
    public static void main(String args[])
    {
        Scanner sc=new SCanner(System.in);
        System.out.println("enter a destination");
        String str=sc.nextLine();
        int x=0,y=0;
        for(int i=0;i<str.lenght();i++)
        {
            char dir=str.charAt(i);
            if(dir='S')
            {
                x--;
            }
            else if(dir='N')
            {
                x++;
            }
            else if(dir='W')
            {
                y--;
            }
            else if(dir='E')
            {
                y++;
            }
        }
         x=x*x;
         y=y*y;
         
    }
}