import java.util.ArrayList;
import java.util.Scanner;
public class ContainerQuestionArrayList
{
    public static void main(String args[]){
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
        System.out.println(Container);
        int max=Integer.MIN_VALUE;
        int WaterStored=Integer.MIN_VALUE;
        for(int i=0;i<Container.size()-1;i++)
        {
            for(int j=i+1;j<Container.size();j++)
            {
                if(Container.get(i)>Container.get(j)){
                     WaterStored=(Container.get(j))*(j-i);
                    if(max<WaterStored){
                        max=WaterStored;
                    }
                }
                else
                {
                     WaterStored=(Container.get(i))*(j-i);
                    if(max<WaterStored){
                        max=WaterStored;
                    }
                }
            }
        }
        System.out.println("max water stored:"+max);
    }
}