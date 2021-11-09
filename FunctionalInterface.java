
interface A
{
    void show();
    
}
public class FunctionalInterface 
{
    //Types of Interfaces:
    //1.NormalInterface:An Interface with more than one method is known as NormalInterface
    //2.Single abstract method Interface:An Interface with only one method is known as SingleInterface
    //3.Marker Interface:It doesn't have any methods ex: Serialiazable Interface
    //single Interface is known as functional Interface from java 8
    //if we know about functional Interface we can use Lambda Expression -Scala
    //we can use annotation like "@functionalInterface" for making an Interface functional
    public static void main(String args[])
    {
        A obj= () -> System.out.println("Iam the best yeah");//LambdaExpression
        //we provided implementation to show method
        //this lambda expression is only possible with functional interfaces
        //we cannot achieve this with interfaces which has more than one method
        obj.show();

    }
    
}
