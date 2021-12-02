package com.telusko;
public class ExceptionsUserDefined 
{
    public static void main(String args[])
    {
        int i,j;
        i=8;
        j=9;
        try{
            int k=i/j;
            if(k==0)
            {
                throw new DemoException("this is not possible");
                
            }
            System.out.println(k);
        }
        catch(DemoException e)
        {
            System.out.println("error"+e.getMessage());
        }
    }
}