class A {
    public A() {
        System.out.println("this is A guys");
    }
    public A(int i) {
        System.out.println("this A int");
    }
}

class B extends A {

    public B() {
        System.out.println("this is B guys");
    }
    public B(int i) {
        super(4);
        //this super() simply calls by default constructor
        //or parameterized consturctor of super class
        //according to arguments given in super() method
        System.out.println("this B int");
    }
}
public class SuperDemo {

    public static void main(String args[]) {


        B obj=new B();
        //when ever we create a object of sub class
        //then consturctor of super class and sub class are called
        B obj1=new B(5);
        //when ever we call a parameterized constructor of sub class
        //a default constructor of super class is called
        //every constructor of sub class have a super() method 
        //this super method calls by default constructor of super class


    }
    
}
