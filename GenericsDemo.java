import java.util.*;
public class GenericsDemo 
{
    public static void main(String args[])
    {
        //List<Integer> values=new ArrayList<Integer>();
        //with generics we can only add specific elements to particular List
        List<Integer>values=new ArrayList<>();//a list is mutable
        values.add(9);
        values.add(7);
        values.add(97);
        //we can also sort the values in List
        Collections.sort(values);
        //Collections is class 
        //sort is a method used to sort the values in list and it is static
        //ascending order
        //we can also reverse the list
        //Collections.reverse(values);
        for(Integer o:values)
        {
            System.out.println(o);
        }
    }
    
}
