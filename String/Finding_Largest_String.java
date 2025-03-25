class Finding_Largest_String
{
    public static void main(String args[])
    {
        String str1="anand";
        String str2="Pradip";
        String str3="Barge";
        String max="";
        if(max.length()<str1.length())
        {
            max=str1;
        }
        if(max.length()<str2.length())
        {
            max=str2;
        }
        if(max.length()<str3.length())
        {
            max=str3;
        }
        System.out.println(max);
    }
}