import java.io.BufferedReader;
import java.nio.Buffer;
import java.io.InputStreamReader;

public class CheckedException
{
    public static void main(String args[])throws Exception
    //generally we can avoid exception in two ways
    //one is using try catch block
    // and other is using throws Exception
    //checked exceptions need to be avoided using throws Exception
    {
        int n=0;
        System.out.println("Enter a number:");
        BufferedReader br=null;
        br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        br.close();
        System.out.println(n);
    }
}