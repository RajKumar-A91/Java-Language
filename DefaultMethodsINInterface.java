interface AB
{
    void show();
    default void display()
    //we can define an method in interface from 1.8 java version by making it "default"
    {
        System.out.println("hi this is method in interface but we can still define it by making this method default");
    }

}
class DemoImpl implements AB
{
    public void show()
    {
        System.out.println("hey hi this show method got difined in DemoImpl class");
    }

}
public class DefaultMethodsINInterface
{
    //abstract class -- we can define and declare a method
    //interface -- in 1.7 we can only declare a method 
    //interface-- in 1.8 and above we can also define and declare a method
    public static void main(String args[])
    {
        AB obj= new DemoImpl();
        obj.display();
        obj.show();

    }
    
}
