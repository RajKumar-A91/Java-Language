interface A
{
    void show();
}
public class AnonymousClassWithInterface
{
    public static void main(String args[])
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("he hiii");
            }

        };
        //actually we cannot instanciate an interface because there is no
        //implementation of an interface
        //but we can implement an interface in creation of its refference like above
        
        obj.show();
        

    }
    
}
