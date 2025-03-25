import java.util.Scanner;
class String_Palindrom_second_solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in );
        System.out.println("enter a string");
        String str=sc.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(isPalindrome(str));
       
    }
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}