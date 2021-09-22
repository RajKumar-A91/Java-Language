abstract class Writer 
{

    public abstract void write();

}
class Pen extends Writer
{
    public void write()
    {

        System.out.println("we can write anything with pen");

    }
}
class Pencil extends Writer
{

    public void write()
    {
        System.out.println("we can also write with pencil");

    }
}
public class assignmentAbstract 
{

    public static void main(String args[])
    {

        Pen p1=new Pen();
        p1.write();
        Pencil p2=new Pencil();
        p2.write();
        


    }    
}
