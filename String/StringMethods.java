import java.util.Scanner;
class StringMethods
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        // String s=new String();
        // System.out.println(isEmpty(s));
        // String s1=new String("durga soft by durga sir");
        // System.out.println(length1(s1));
        // System.out.println(length(s1));
        // String replacedString=replace(s1,'a','b');
        // System.out.println(replacedString);
        // System.out.println(substring(s1,1,3));
        // String s3="java is great";
        // System.out.println(WordCount(s3));
        // s3=reverseString(s3);
        // System.out.println(s3);
        // String s4="maRa&&kram";
        // System.out.println("ispalindrome:"+isPalindrome(s4));

        // String s5=new String("java and javascript");
        // duplicateCharacter(s5);
        // System.out.println(isAnagram("aabc","caba"));
        // System.out.println(isRotated("xyz","yzx"));

        // String s6=new String("abc");
        // int permutation=totalPermutation("abc");
        //permute("abc");
        // degitToWord(123);
        //game();
        // checkContenet("anandBarge464@.com");
        // numberToWord(20015);
    }
       public static void permute(String str)
   {
        Set<String>result=new HashSet<>();
        permutation("",str,result);
        System.out.println(result);
   }
   public static void permutation(String prefix,String remaining,Set<String>result)
   {
        if(remaining.isEmpty())
        {
            result.add(prefix);
            return;
        }
        for(int i=0;i<remaining.length();i++)
        {
            String newPrefix=prefix+remaining.charAt(i);
            String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);
            permutation(newPrefix, newRemaining, result);
        }
   }
    public static boolean isEmpty(String s)
    {
        if(s.length()==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static int length1(String s)
    {
        int count=0;
        s=s+"  ";
        int i=0;
        while(s.charAt(i)!=' ' || s.charAt(i+1)!=' ')
        {
            count++;
            i++;
          
        }
        return count;
    }
    public static int length(String s)
    {
        int count=0;
        try{
            while(true)
            {
                s.charAt(count);
                count++;
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            return count;
        }
    }
    public static String replace(String s,char oldChar,char newChar)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==oldChar)
            {
                sb=sb.append(newChar);
            }
            else{
                sb=sb.append(s.charAt(i));
            }
        }
        String newString=sb.toString();
        return newString;
    }
    public static String substring(String s,int begin,int end)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=begin;i<end;i++)
        {
            sb.append(s.charAt(i));
        }
        String substring=sb.toString();
        return substring;
    }
    public static int indexOf(String s,char ch)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                return i;
            }
        }
        return -1;
    }
    public static int lastIndexOf(String s,char ch)
    {
        for(int i=s.length()-1;i>=0;i++)
        {
            if(s.charAt(i)==ch)
            {
                return i;
            }
        }
        return -1;
    }
    public static String toLowercase(String s)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                sb.append((char)s.charAt(i)+32);
            }
            else
             sb.append(s.charAt(i));
        }
        String lowerCaseString=sb.toString();
        return lowerCaseString;
    }
    public static String toUpperCase(String s)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                sb.append((char)s.charAt(i)-32);
            }
            else
             sb.append(s.charAt(i));
        }
        String lowerCaseString=sb.toString();
        return lowerCaseString;
    }
    public static int WordCount(String s)
    {
        s=s.trim();
       if(s.length()==0)
       {
            return 0;
       }
      
       String s1[]=s.split("\\s+");
       return s1.length;

    }
    public static String reverseString(String s)
    {
        s=s.trim();
        if(s.length()==0)
        {
            return "";
        }
        String s1[]=s.split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=s1.length-1;i>=0;i--)
        {
            sb.append(s1[i]+" ");
        }
        s=sb.toString().trim();
        return s;
    }
    public static boolean isPalindrome(String s)
    {
       s=s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
       StringBuffer sb=new StringBuffer();
       for(int i=s.length()-1;i>=0;i--)
       {
        sb.append(s.charAt(i));
       }
       String s1=sb.toString();
       if(s1.equals(s))
       {
        return true;
       }
       else{
        return false;
       }
    }
    public static void  duplicateCharacter(String s)
    {

        s=s.toLowerCase();
        s=s.replaceAll("[^a-z]","");
        if(s.length()==0)
        {
            System.out.println("No duplicate characters");
            return;
        }
        boolean isDuplicate=false;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(max<s.charAt(i)){
                max=s.charAt(i);
            }
            if(min>s.charAt(i))
            {
                min=s.charAt(i);
            }
        }
        int[] count=new int[max-min+1];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-min]++;
        }
        for(int i=0;i<count.length;i++)
        {
            int maxIndex=i;
           for(int j=0;j<count.length;j++)
           {
                if(count[maxIndex]<count[j])
                {
                    maxIndex=j;
                }
           }
           if(count[maxIndex]>=2){
            isDuplicate=true;
           System.out.println((char)(maxIndex+min)+":"+count[maxIndex]);
        }
           count[maxIndex]=0;
        }
        if(isDuplicate==false)
        {
            System.out.println("No duplicate characters");
        }
    }
    public static boolean isAnagram(String s1,String s2)
    {
        s1=s1.toLowerCase().trim();
        s2=s2.toLowerCase().trim();
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<s1.length();i++)
        {
            if(max1<s1.charAt(i))
            {
                max1=s1.charAt(i);
            }
            if(min1>s1.charAt(i))
            {
                min1=s1.charAt(i);
            }
        }
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<s2.length();i++)
        {
            if(max2<s2.charAt(i))
            {
                max2=s2.charAt(i);
            }
            if(min2>s2.charAt(i))
            {
                min2=s2.charAt(i);
            }
        }
        int max=Math.max(max1,max2);
        int min=Math.min(min1,min2);
        int []count1=new int[max-min+1];
        for(int i=0;i<s1.length();i++)
        {
            count1[s1.charAt(i)-min]++;
            count1[s2.charAt(i)-min]--;
        }
        for(int i=0;i<count1.length;i++)
        {
            if(count1[i]!=0)
            {
                   return false;
            }
        }
        
        return true;
    }
    public static boolean isRotated(String s1,String s2)
    {
       boolean isRotate=false;
        char s[]=new char[s1.length()];
        for(int i=1;i<=s.length-1;i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                s[j]=s1.charAt(j);
            }

            reverse(s,0,s.length-1);
            reverse(s,0,i-1);
            reverse(s, i,s.length-1);
            StringBuffer sb=new StringBuffer();
            for(int j=0;j<s.length;j++)
            {
                sb.append(s[j]);
            }

            System.out.println(sb);
            String rotateString=sb.toString();
            if(rotateString.equals(s2))
            {
                isRotate=true;
                break;
            }
      
        }
        if( isRotate==true)return true;
        else 
        return false;
    }
    public static void reverse(char[] c,int start,int end)
    {
        while(start<end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
    }
    public static int totalPermutation(String s)
    {
        
        int totalPermutation=1;
        for(int i=s.length();i>0;i--)
        {
            totalPermutation=totalPermutation*i;
        }
        System.out.println(totalPermutation);
        return totalPermutation;
    }
    public static void permutation(String s,int start,int end,int length,int pointer,String [] str)
    {
        if(length==0)return;
        
       
            boolean isPresent=false;
            for(int j=0;j<pointer;j++)
            {
                if(s.equals(str[j]))
                {
                    isPresent=true;
                    break;
                   
                }
            }
            if(isPresent==false)
            {
                str[pointer]=s;
                pointer++;
                System.out.println(s);
            }

        StringBuffer sb=new StringBuffer();
        sb.append(s);
        char ch=sb.charAt(end);
        sb.setCharAt(end, sb.charAt(start));
        sb.setCharAt(start, ch);
        start=(start+1)%(s.length());
        end=(end+1)%(s.length());
        s=sb.toString();
        permutation(s,start,end,length-1,pointer,str);   
    }
    public static void degitToWord(int n)
    {
        String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0)
        {
            System.out.println("zero");
            return;
        }
        StringBuffer sb=new StringBuffer();
        while(n!=0)
        {
           int  rem=n%10;
           n=n/10;
           sb.append(str[rem]+" ");
        }
        String s=sb.toString().trim();
        sb.setLength(0);
        String [] str1=s.split("\\s+");
        for(int i=str1.length-1;i>=0;i--)
        {
            sb.append(str1[i]+" ");
        }
        s=sb.toString().trim();
        System.out.println(s);
    }
    public static void game()
    {
        String s="python";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            sb.append('_');
        }
        System.out.println(sb);
        for(int i=0;i<s.length();i++)
        {
            System.out.println("enter char");
            char ch=sc.next().charAt(0);
            for(int j=0;j<s.length();j++)
            { 
                if(s.charAt(j)==ch)
                {
                   System.out.println(s.charAt(j));
                   sb.setCharAt(j, ch);
                   break;
                }  
            }
             System.out.println(sb);
        }
        String s1=sb.toString();
        if(s1.equals(s))
        {
            System.out.println("won");
        }
    }
    public static void checkContenet(String s)
    {
        int lowerCase=0;
        int upperCase=0;
        int degit=0;
        int specialChar=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<90)
            {
               upperCase++; 
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<122)
            {
                lowerCase++;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<57)
            {
                degit++;
            }
            else{
                specialChar++;
            }
        }
        System.out.println("lowercase:"+lowerCase+"upperCase:"+upperCase+"degit:"+degit+"specialChar:"+specialChar);
    }
    // public static void numberToWord(int number)
    // {
    //     String str1[]={"one","two","three","four","five","six","seven","eight","nine"};
    //     String str2[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
    //     String str3[]={"hundread","thousand","thousand","lakh","lakh","crore"};
    //     String str4[]={"ten","eleven","twelve","therteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
    //     StringBuffer sb=new StringBuffer();
    //     int temp=number;
    //     int count=0;
    //     int rem=0;
    //     int position=0;
    //     while(temp!=0)
    //     {
    //         count++;
    //         temp=temp/10;
    //     }
    //     int origanCount=count;
    //     while(number!=0)
    //     {
    //         int priviousRem=rem;
    //         rem=number%10;
    //         number=number/10;
    //         if(rem==0 &&  count==origanCount)  
    //         {
    //             sb.append("zero ");
    //         }
    //         else if(count==origanCount-1 && rem==1)
    //         {
    //             sb.setLength(0);
    //             sb.append(str4[priviousRem]+" ");
    //         }
    //         else if(count==origanCount-1 && rem!=0 &&priviousRem==0)
    //         {
    //             sb.setLength(0);
    //             sb.append(str2[rem-1]+" ");
    //         }
    //         else if(count==origanCount-1 && rem!=0 &&priviousRem!=0)
    //         {
        
    //             sb.append(str2[rem-1]+" ");
    //         }
    //         else if(count==origanCount-2 && rem!=0){
               
    //              sb.append(str3[position]);
    //              sb.append(str1[rem-1]);
              
               
    //         }
    //         else if(count<=origanCount-2 && rem!=0 && origanCount<=4)
    //         {
    //            sb.append(str3[position]);
               
    //            sb.append(str1[rem-1]);
    //         }
    //         else if(count<=origanCount-2 && origanCount>=4 && origanCount<=5)
    //         {
    //             if(position==1){
    //                  sb.append(str3[position]);
    //                if(rem-1>=0)
    //                 sb.append(str1[rem-1]);
    //             }
    //             if(position!=1){
    //             sb.append(str2[rem-1]+" ");
    //         }
            
    //         }
    //         else if(rem!=0){
    //             sb.append(str1[rem-1]);
    //         }
    //         if(count<=origanCount-2)
    //         {
    //             position++;
    //         }
    //         count--;
    //     }
    //     System.out.println(sb);
    // }

}
