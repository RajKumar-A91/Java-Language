class Emp
{
    int id;
    int salary;
    static String ceo;
    //by using static keyword the value of ceo is going to be same for all
    //objects of this particular class
    //we can use CONSTRUCTORS to intialize non-static varialbles
    //Constructor will be executed when we create a object
    static
    {
        ceo="Raaj";
    }
    //this static block is used to intialize the static varibles
    //this static block will be executed when we load the class
    //a class will going to loaded only once
    //always static block will get executed first than constructor
    void show()
    {
        System.out.println(id+" "+salary+" "+ceo);
    }
}
public class StaticDemo 
{
    public static void main(String []args)
    {
        //we cannnot access a non static variable in static block
        Emp Amulya=new Emp();
      //  Emp.ceo="Raj";
        //variable declared with static keyword can be directly accessed by class 
        //there is no need for object refference
        Amulya.id=67;
        Amulya.salary=50000;
        Emp Tharun=new Emp();
        Tharun.id=81;
        Tharun.salary=50000;
      //  Emp.ceo="RajKumar";
        Amulya.show();
        Tharun.show();

    }
    
}
