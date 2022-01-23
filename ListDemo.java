import java.util.*;
import java.io.*;
public class ListDemo 
{
    public static void main(String args[])
    {
        List values=new ArrayList();
        values.add(9);//values we passed in add method are from wrapper classes//here 9 is an object
        values.add(7);//Integer v=new Integer(7);
        values.add("Raj");//add method takes parameter object
        values.add(2,"ARK");//String n=new String("ARK");
        //These all are wrapper class objects
        //in List we have method called add() in which we can two parameters index number and value
        //List can operate with index numbers
       /* Iterator it=values.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        */
        //we can also use Iterator and iterator method with List 
        for(int i=0;i<values.size();i++)//we have size() method in Collection for knowing the size of a particular list or collection
        {
            System.out.println(values.get(i));//get is a method present in List which takes indext num as parameter and returns value present at passed argument

        }
        //here we can also use enhanced for loop for printing values of elements
        for(Object o:values)
        {
            System.out.println(o);
        }
    }
    
}
