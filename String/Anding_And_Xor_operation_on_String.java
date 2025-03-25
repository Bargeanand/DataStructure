import java.util.Scanner;
class Anding_And_Xor_operation_on_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int input_array[]=new int[s.length()];
        char output_array;
        for(int i=0;i<s.length();i++)
        {
          input_array[i]=s.charAt(i);
        }
        And_operation(s,input_array);
        System.out.println();
        Xor_Operation(s,input_array);
    }
    public static void And_operation(String s,int input_array[])
    {
        char output_array;
         for(int i=0;i<s.length();i++)
        {
            input_array[i]=(input_array[i]&127);
            int k=input_array[i];
            output_array=(char)k;
            System.out.print(output_array);
        }
    }
    public static void Xor_Operation(String s,int input_array[])
    {
        char output_array;
        for(int i=0;i<s.length();i++)
        {
            input_array[i]=(input_array[i] ^ 127);
            int k=input_array[i];;
            output_array=(char)k;
            System.out.print(output_array);

        }
    }
}