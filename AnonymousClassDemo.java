class A
{
    public void show()
    {
        System.out.println("hey hi frnds");
    }
}
public class AnonymousClassDemo 
{
    public static void main(String []args)
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("hey iam the best");
            }
        };
        //an anonymous class is a class without name
        // and the scope of anonymous class is in its definition itself
        //the above is a class without name
        //the above is also a class
        //but it is anonymous class
        //whenever we want to override a method without extra class
        //we can use this process
        //we can use this anonymous class
        obj.show();

    }
    
}
