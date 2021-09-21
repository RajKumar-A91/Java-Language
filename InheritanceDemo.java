//Two types of relationships ie is is-a  has-a
//when class extends an another class known as is-a relation
//when class has a object of another class is known as has a relation 
class Calculator{//parent or super class
    public int add(int i,int j){
        return i+j;
    }
}
class AdvanceCalculator extends Calculator{//child or sub class
    //this child class inherits all futures of the parent class
    //ie it can access all futures of parent class
    //but a parent class cannot inherit futures from its child class
    /* Java-super and sub
       C++-Base and derived
       oops-parent and child

    */
    //if a class inherits only one class then it is known as single level 
    //inheritance

    public int sub(int i,int j){
        return i-j;
    }

}

class VeryAdvanceCalci extends AdvanceCalculator{
    //this class extends AdvanceCalculator class 
    //as we know AdvanceCalculator class extends Calculator class
    //therefore VeryAdvanceCalci has all futures of Calculator class
    //and VeryAdvanceCalci
    //like Calculator class--->Grandfather
    //AdvanceCalculator---->chil
    //VeryAdvanceCalci----->Grandchild
    //this is known as multilevel inheritance

    public int mul(int i,int j){
        return i*j;
    }
}

public class InheritanceDemo {
    

    public static void main(String args[]){

        VeryAdvanceCalci obj=new VeryAdvanceCalci();
        System.out.println(obj.add(5,9));
        System.out.println(obj.sub(8,4));
        System.out.println(obj.mul(5,5));



    }
}
