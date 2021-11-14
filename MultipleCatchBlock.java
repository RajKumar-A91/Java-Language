public class MultipleCatchBlock 
{
    public static void main(String args[])
    {
        try 
        {
            int a[]=null;
            a[5]=5;
            int j=9/0;
        }
    /*catch(ArrayIndexOutOfBoundsException | ArithmeticException a)
        {
            System.out.println("this has an error with array index out of bounds exception and arithmetic exception");
        }*/
        catch(ArithmeticException e) 
        {
            System.out.println("stay in ur limits");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("cannot print out side or array");
        }
        catch(NullPointerException e)
        {
            System.out.println("this is null pointer exception");
        }
        catch(Exception e)
        {
            System.out.println("something is fisshy");
        }
        //Runtime exception is subclass of Exception super class
        //And all specific exceptions are subclasses of Runtime exceptions
    }
    
}
