import java.util.*;
public class SetDemo 
{
    public static void main(String args[])
    {
        Set<Integer> values=new HashSet<>();
        //here we are using HashSet class
        //so while storing in memory hashing is used 
        //and while retreving or printing set elements we may get elements in random mannner ie because element which is nearer it is printed first
        //so for getting elements in an sorted or ascending order we can use TreeSet
        //Set<Integer> values=new TreeSet<>();
        //Set is an interface similar to List 
        //only difference is there is no duplicate elements in Set 
        //where as in Lists there can be duplicate elements
        System.out.println(values.add(9));
        System.out.println(values.add(7));
        System.out.println(values.add(9));
        //add is a method which returns boolean 
        //returns true if element is added
        //return false if element is not added
        for(int i:values)
        {
            System.out.println(i);
        }
    }
    
}
