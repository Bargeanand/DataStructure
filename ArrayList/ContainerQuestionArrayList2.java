import java.util.ArrayList;
import java.util.Scanner;

public class ContainerQuestionArrayList2
{
    public static void main(String args[])
    {
        ArrayList<Integer>Container=new ArrayList<>();
        Container.add(1);
        Container.add(8);
        Container.add(6);
        Container.add(2);
        Container.add(5);
        Container.add(4);
        Container.add(8);
        Container.add(3);
        Container.add(7);
       int left=0,right=Container.size()-1;
       int maxWater=0;
       while(left<right)
       {
            int height=Math.min(Container.get(left),Container.get(right));
            int width=right-left;
            maxWater=Math.max(maxWater,height*width);
            if(Container.get(left)<Container.get(right))
            {
                left++;
            }
            else{
                right--;
            }
       }
       System.out.println("max water stored:"+maxWater);
    }
}