public class ConstructorDemo
{
    int num1,num2;
    public ConstructorDemo()
    {
        System.out.println("HI this default constructor");
    }
    public ConstructorDemo(int i)
    {
        System.out.println("HELLO this parameterized constructor");
    }
    public ConstructorDemo(float f)
    {
        System.out.println("this accepts another kind of parameter");
    }
    public ConstructorDemo(int num1,int num2)
    {
        this.num1=num1;//right side num1 is local varial and left side is instance variable
        this.num2=num2;//this keyword is must and should be used in case of local and instance 
        //variable are with same name
        System.out.println(num1+" "+num2);
    }
    public static void main(String []args)
    {
        ConstructorDemo obj=new ConstructorDemo(2,3);
        
    }
}
    

