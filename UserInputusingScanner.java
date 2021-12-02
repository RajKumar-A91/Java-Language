import java.util.Scanner;

public class UserInputusingScanner
{
    public static void main(String args[])throws Exception
    {
        int n;
        float f;
        double d;
        String s;
        String c;
        boolean b;
        short st;
        long l;
        byte byt;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        //It takes int type input value from the user.
        f=sc.nextFloat();
        //It takes float type input value from the user.
        d=sc.nextDouble();
        //It takes double type input value from the user.
        c=sc.next();
        //	It takes a word as an input value from the user.
        sc.nextLine();
        s=sc.nextLine();
        //It takes a line as an input value from the user.
        b=sc.nextBoolean();
        //It takes a boolean type input value from the user.
        st=sc.nextShort();
        //It takes a short type input value from the user.
        l=sc.nextLong();
        //It takes a long type input value from the user.
        byt=sc.nextByte();
        //It takes a byte type input value from the user.
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        System.out.println(b);
        System.out.println(st);
        System.out.println(l);
        System.out.println(byt);

    }

}