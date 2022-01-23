import java.util.List;
import java.lang.String;
import java.util.*;
import java.io.*;
class Friends implements Comparable<Friends>
//for sorting we need to implement comparable interface
//when we have our own class and list of objects of that class
//and if we want to sort elements we can use Comparable interface method called compareTo
{
    int roll,marks;
    String name;
    public Friends(int roll,int marks,String name)
    {
        super();
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "Friend[rollno:"+roll+",name:"+name+",marks:"+marks+"]";
    }
    public int compareTo(Friends s)
    {
        //return marks>s.marks?-1:1;//we can sort based on anything like roll or name or marks
        return name.length()>s.name.length()?1:-1;
    }
}
public class ComparableDemo 
{
    public static void main(String args[])
    {
        List<Friends>st=new ArrayList<>();
        st.add(new Friends(9, 99, "Raj"));
        st.add(new Friends(7, 90, "Amulya"));
        st.add(new Friends(12, 85, "Tharun"));
        Collections.sort(st);
        
        for(Friends s:st)
        {
            System.out.println(s);
        }
    }
    
}
