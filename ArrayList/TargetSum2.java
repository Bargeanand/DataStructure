import java.util.Scanner;
import java.util.ArrayList;
public class TargetSum2{
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int left=0,right=List.size()-1;
        boolean found=false;
        while(left<right)
        {
            if(List.get(left)+List.get(right)==5)
            {
                System.out.println("First Element:"+List.get(left)+" Second Element:"+List.get(right));
                found=true;
                break;
            }
            if(List.get(left)+List.get(right)<5)
            {
                left++;
            }
            else{
                right--;
            }
          
        }
        if(found==false)
        {
            System.out.println("pair not found:");
        }
    }
}