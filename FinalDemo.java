final class A
{

    /*final with variable---> constant
    *final with method----> no more Overriding
    *final with class--->no inheritance
    */
    //a final class cannot be inherited
    //we cannot extend a class which is declared as final
    
    final int i=0;//constant
    //if we declare a variable then we cannot change its value in fututer
    //ie it is simply going to be constant

    public A()
    {
        
    }
    public final void show()
    {
        //if a method is declared is final we cannot Override it anymore

    }
}
class B extends A 
{

    public void show()
    {

    }
}
public class FinalDemo 
{

    public static void main(String args[])
    {


        A obj = new A();
        System.out.println(obj.i);


    }
    
}
