import java.util.Scanner; 
class String_Palindrome_not_sutaibel_for_special_Char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=sc.nextLine();
        str1=str1.replaceAll("\\s+","").toLowerCase();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
           str2+=str1.charAt(i);
        }
        System.out.println("str2 is: "+str2);
        if(str1.equals(str2))
        {
            System.out.println("string are palindrome");
        }
        else
        {
            System.out.println("string are not palindrome");
        }
    }
}