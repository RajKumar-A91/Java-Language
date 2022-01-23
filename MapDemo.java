import java.util.*;
public class MapDemo 
{
    public static void main(String []args)throws Exception
    {
        //Map is an interface used for storing key-value pair elements
        //a key and value can be anything ie Wrapper class
        Map<Integer,Integer>m=new HashMap<>();
        //we can also use class HashTalbe instead of HashMap
        //HashTable is synchronized where as HashMap is not synchronized
        //Map<Integer,Integer>m=new HashMap<>();
        m.put(1,9);
        m.put(2,7);
        m.put(3,2);
        m.put(4,1);
        //we duplicate values 
        //but we cannot duplicate keys
        //keys are unique
        System.out.println(m);
        Set<Integer>key=m.keySet();
        for(int i:key)
        {
            System.out.println(m.get(i));
        }
    }
    
}
