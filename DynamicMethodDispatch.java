class A {

    int j=303;
    public void show()
    {
        System.out.println("this is a guys");
    }
}
class B extends A {

    
    int j=101;
    public void show()
    {
        System.out.println("this is b guys");
    }
    
}

class C extends A {
    public void show()
    {
        System.out.println("this is c guys");
    }
}
public class DynamicMethodDispatch {

    public static void main(String []args)

    {
        //the methodoverriding is called runtime polymorphism
        //runtime polymorphism and runtime polymorphism
        A obj=new B();//here we have refference of A and object of B
        //thats why we got show method of B
        //this linking takes place during runtime
        obj.show();
        obj=new C();//the concept of changing object is known as 
        //dynamic method dispatch
        obj.show();
       System.out.println(obj.j);
       // obj.config();
       //we can also create referrence of a and object of b
       // but we can only access 

    }
    
}
