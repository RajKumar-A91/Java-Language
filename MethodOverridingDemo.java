class A {

    int i;

    public void show()
    {
        System.out.println(" this is class A show method");
    }
}

class B extends A {
    
    int i;
    @Override
    //this @Override makes sure to get compile error if there is any error present
    //in overriding instead of logical error we get compile time error by
    //@Override
    public void show() {
        
        super.i=9;
        //this is super class i variable
        i=8;
        //this is sub class i variable
        super.show();
        //super is keyword with that we can access the variables and methods of
        //a super class
        //the above super.show() calls the super show method
        System.out.println("this is class B show method");
        System.out.println("this is class A of class B");
        System.out.println(i);
        System.out.println(super.i);
    }
    //here show method of class A got overridded by class B ie A is super class
    //B is subclass
    //a method of super class can be overridded by its sub class
}

public class MethodOverridingDemo {

    public static void main(String args[]) {

        B obj=new B();
        obj.show();


    }
    
}
