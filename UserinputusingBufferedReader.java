import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserinputusingBufferedReader
{
   public static void main(String[] args)throws Exception
    {
        System.out.println("Enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        //System.in represents here input is taken from keyboard
        //That input is converted into stream reader
        //and it is passed into BufferedReader
        //before using BufferedReader we need to create an objectof
        //InputStreamReader and then we need to pass the object into
        //object of BufferedReader instance
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(in);
        int n=Integer.parseInt(br.readLine());
        //readLine is a method which takes string as input
        //for integer value we need to convert it into int
        //parseInt is a method which takes input as string
        //and gives you int value as output
        //parseInt is a static method 
        //so we need to use its class ie Integer name while accessing that method

        System.out.println(n);
        
    }
}