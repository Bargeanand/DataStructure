public class StringBufferMethod {
    public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer("java");
      setCharAt(sb,0,'y');
      sb.setCharAt(0,'y');
      System.out.println(sb);
      sb=insert(sb,0,'j');
      System.out.println(sb);
      StringBuffer sb1=new StringBuffer("anand barge");
      length(sb1);
      sb1=delete(sb1,0,6);
      System.out.println(sb1);
      sb1=deleteCharAt(sb1, 0);
      System.out.println(sb1);
    }
    public static void setCharAt(StringBuffer sb,int index,char ch)
    {
        StringBuffer sb1=new StringBuffer();
       for(int i=0;i<sb.length();i++)
       {
        if(i==index)
        {
            sb1.append(ch);
        }
        else{
            sb1.append(sb.charAt(i));
        }
       }
       sb=sb1;
       System.out.println(sb);
    }
    public static StringBuffer insert(StringBuffer sb,int index,char ch)
    {
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<sb.length();i++)
        {
            if(i==index)
            {
                sb1.append(ch);
            }
                sb1.append(sb.charAt(i));
        }
        if(index==sb.length())
        {
            sb.append(ch);
        }
        return sb1;
    }
    public static int length(StringBuffer sb)
    {
        int count=0;
        try{
            while(true)
            {
                sb.charAt(count);
                count++;
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(count);
        }
        return count;
    }
    public static StringBuffer delete(StringBuffer sb,int start,int end)
    {
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<sb.length();i++)
        {
            if(i>end-1 || i<start)
            {
                sb1.append(sb.charAt(i));
            }
        }
        sb=sb1;
        return sb1;
    }
    public static StringBuffer deleteCharAt(StringBuffer sb,int index)
    {
        StringBuffer sb1=new StringBuffer();
        for(int i=0;i<sb.length();i++)
        {
            if(i!=index)
            {
                sb1.append(sb.charAt(i));
            }
        }
        return sb1;
    }
}
