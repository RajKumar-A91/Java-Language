class Outer
{
    int n;
    void show()
    {
        System.out.println("Hello guys how are you doing");
    }
    //the only purpose of inner class is to work with outer class
    class Inner//Outer$Inner.class
    {
        /*inner classes are of three types 
        *member class like this one
        *static class
        *Anonymous class
        */
        void display()
        {
            System.out.println("this method displays when Inner class gets executed");
        }
    }
}
public class InnerDemo 
{
    //a class can have data member,member method,Inner class
    public static void main(String []args)
    {
        Outer obj=new Outer();
        Outer.Inner obj1=obj.new Inner();
        /*
        if inner class is static 
        for creating object syntax will be different ie 
        we dont need obj of outer class
        Outer.Inner obj1=new Outer.Inner();
        */
        //for creating object for inner class
        //left side is class so we use class for accessing ie inorder to use innner class 
        //we have to use outer class for accessing
        //right side is object so we use object to access ie inorder to create object of
        //inner class we have to use outer class object
        obj1.display();
        obj.show();
    }
}
