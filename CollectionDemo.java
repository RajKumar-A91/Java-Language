import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class CollectionDemo 
{
    public static void main(String args[])throws Exception
    {
        Collection values=new ArrayList();
        values.add(9);
        values.add(7);
        //add is method present in Collection interface
        //Collection interface extends Iterable interface
        values.add("Raj");
        System.out.println(values);
        //Collections doesn't work with index numbers
        //for accessing specific elements
        //so this can solve by and interface called Iterator 
        //Iterator can iterate over an Collection
        Iterator it=values.iterator();
        //iterator() is a method in Iterator interface which returns object of Iterator
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
    
}
