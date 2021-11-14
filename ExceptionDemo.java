public class ExceptionDemo
{
    public static void main(String args[])
    {
        //Right after exception encounters the execution gets stoped
        //for continuing execution even after encountering the exception we need to 
        //handle that exception
        //we need try catch blocks for handling the exception
        try
        {
            int a=9/0;
            //this is a critical statement
            //bcoz the above statement may throw and exception
            /*int i=2;
            int j=4;
            int k=j/i;
            System.out.println(k);
            */

        }
        //as soon as try block encounters the exception
        //the compiler jumps in catch block
        //the try block will throw the exception
        //the statement in try block throw the object of exception
        //and the catch block will catch the exception
        //and the catch block need accept the exception thrown by try block
        catch(ArithmeticException e)
        {
            System.out.println("Error got occured please check the code");
            System.err.println("Error");//err stands for error
            
        }
        finally
        {
            System.out.println("this finally block will get excuted no matter wheather there is exception or not");

        }
        
        System.out.println("BYE");//this is normal statement bcoz it doesn't 
        //throw an exception
        
    }
    
}
