abstract class Human {  //abstract class
    //if we have an abstract method in a class
    //then that class must an should be an abstract class
    //we can also have a abstract class without abstract method
    //but it is necessary to have an abstract class with abstract method
    //once we declare a class abstract we cannot create a object for it
    public abstract void eat();//we can declare or define a method
    public abstract void work();//we can able to declare a method with only abstract keyword
    public abstract void sleep();

}

class Men extends Human {  //concrete class
    
    //if you extends an abstract class it is compulsory to define abstract methods init
    public void eat() {
        System.out.println("A men should eat something to work");
    }
    public void work() {
        System.out.println("A man can work if and only if he eats something");
    }
    public void sleep() {
        System.out.println("A man must and should take a deep sleep");
    }
    //we should define every abstract method of abstract class if we extends that
    //class

}
public class AbstractDemo {

    public static void main(String []args)
    {
        
        //we cannot create object of abstract class
        //but we can create an refference of an abstract class
        Human h1;
        h1=new Men();
        Men m1=new Men();
        m1.eat();
        m1.work();
        m1.sleep();
        h1.eat();
        h1.work();
        h1.sleep();
      
    }
    
}
