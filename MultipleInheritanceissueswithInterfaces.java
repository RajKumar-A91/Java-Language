interface Demo
{
    default void show()
    {
        System.out.println("hi this is in Demo show");
    }
}
interface MyDemo
{
    
    default void show()
    {
        System.out.println("hi this is in MyDemo show");
    }
}
class DemoImpl implements Demo,MyDemo
{
    /*public void show()
    {
        System.out.println("this is show of DemoImpl");
    }*/
    @Override
    public void show()
    {
        Demo.super.show();
    
    }

}
public class MultipleInheritanceissueswithInterfaces
{
    public static void main(String args[])
    {
        Demo obj=new DemoImpl();
        obj.show();

    }
}