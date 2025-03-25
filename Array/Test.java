 import java.util.*;
 class Test{
   
    public static void main(String args[])
    {
    //     Scanner sc=new Scanner(System.in);
    //    // Test rohan=new Test();
    //     int x1=sc.nextInt(); 
    //     int x2=sc.nextInt();
    //    int Rohan= sum(x1,x2,0);    //Rohan=3
    //    System.out.println(Rohan);
    //     //rohan.sum(sc.nextInt(),sc.nextInt(),0);

    // }
    // public  static int sum(int a,int b,int sum)   //1,2
    // {
    //     return sum=a+b; //1+2=3
    
    // }
//public static void sub(int a,int b,int sub)
Scanner sc=new Scanner(System.in);
System.out.println("enter a size");
int size=sc.nextInt();
int array[]=new int[size];
int max=Integer.MIN_VALUE;
for(int i=0;i<size;i++)
{
    System.out.println("enter a array element");
    array[i]=sc.nextInt();
    if(max<array[i])
    {
        max=array[i];
    }
}
Arrays.sort(array);
System.out.print("[");
        for(int y=0;y<size;y++)
        {
            System.out.print(array[y]);
            if(y<size-1)
            {
                System.out.print(",");
            }
            
        }
        System.out.print("]");

}
 }

























        // int [][]x={{20,30},{40,50,60}};
        // System.out.println(x[0][0]);
        // int[] x;
        // x={10,20,30};
        // int []x=new int[6];
        // //System.out.println(x.length());
        // System.out.println(x.length);
        //String []s={"a","aa","aaa"};
       // System.out.println(s.length());
      // System.out.println(s.length);
      //System.out.println(s[0].length());
    //   int [][]x=new int[6][3];
    //   System.out.println(x.length);
    //   System.out.println(x[0].length);
        // char []ch={'a','b','c'};
        // int []c=ch;
    //  int a[]=new int[6];
    //     for(int i=0;i<a.length;i++)
    //     {
    //         a[i]=10;
    //     }
    //     int []b=new int[2];
    //     b=a;
    //     for(int i=0;i<b.length;i++){
    //     System.out.println(b[i]);   
        // for(int i=0;i<4;i++)
        // {
        //     System.out.println(args[i]);
        // }
    //     Unit_test unit_test=new  Unit_test();
    //    unit_test.setNumber(10);
    //    System.out.println(unit_test.getNumber());
        // Test t=new Test();
        // System.out.println(t.x);
        // t.m1();

        

    
    // public  void m1()
    // {
    //     System.out.println("hello");
    // }
    
