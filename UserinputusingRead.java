public class UserinputusingRead
{
    public static void main(String args[])throws Exception
    {
        int i;
        int n;
       // n=System.in.read();
        // read function can read from zero to 255
        //read function prints ascii value of given input
        //read function can read only one character
       // System.out.println((char)n);
        String str="";
        //by this while loop we can take multiple characters as input
        //13 is the ascii value of enter 
        //so until unless you enter the enter keyword it considers everything as input
        while(( i=System.in.read())!=13)
        {
            str=str+(char)i;

        }
        System.out.println(str);
    }
}