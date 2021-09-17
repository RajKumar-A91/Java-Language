class Calci
{
    int num1,num2,result;
    void add()
    {
        result=num1+num2;
        System.out.println(result);
    }
    void sub()
    {
        result=num1-num2;
        System.out.println(result);
    }
    void mul()
    {
        result=num1*num2;
        System.out.println(result);
    }
    void div()
    {
        result=num1/num2;
        System.out.println(result);
    }
}
public class ClassObjectDemo
 {
    public static void main(String []args)
    {
        Calci obj=new Calci(); //"obj" is object refference to class "Calci"
        obj.num1=10;
        obj.num2=5;
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

    }
}
