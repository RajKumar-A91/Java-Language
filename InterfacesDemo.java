interface Writer
//java does not support multiple inheritance
//so we use interface for this
//the difference between an abstract class and interface is
//an abstract class can contain an methods with definitions and 
//also methods without definitions
//where as an interface can contain only asbtract methods ie methods without 
//definitions
//all methods in interface are by default public abstract 
//and also we can create refference of interface but not object of interface
//only we can create refference of interface but not object of interface
{

    public abstract void write();

}
class Pen implements Writer
//extends for extending class
//implements for implementing interface
//we can acheive multiple inheritance by interfaces
{
    public void write()
    {

        System.out.println("we can write anything with pen");

    }
}
class Pencil implements Writer
{

    public void write()
    {
        System.out.println("we can also write with pencil");

    }
}
class Kit
{
    public void doSomething(Writer x)
    {
        x.write();

    }
}
public class InterfacesDemo
{

    public static void main(String args[])
    {

        
        Kit k=new Kit();
        Writer p=new Pen();
        Writer pc=new Pencil();

        k.doSomething(p);
        


    }    
}
