import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class ComparatorDemo 
{
    public static void main(String args[])
    {
        List<Integer>values=new ArrayList<>();
        values.add(609);
        values.add(894);
        values.add(229);
        values.add(467);
        Comparator<Integer> c=new Comparator<Integer>() {
            public int compare(Integer i, Integer j)
            {
                if(i%10>j%10)
                return 1;
                else
                return -1;
            }
        };
        Collections.sort(values,c);
        for(Integer o:values)
        {
            System.out.println(o);
        }
    }
    
}
