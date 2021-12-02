import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrywithResources
{
    public static void main(String args[])throws Exception
    {
        int n=0;
        System.out.println("Enter the number:");
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
        {
            n=Integer.parseInt(br.readLine());
        }
        //here we no need write br.close();
        //because after try block br resource automatically get closed
        System.out.println(n);

    }
}