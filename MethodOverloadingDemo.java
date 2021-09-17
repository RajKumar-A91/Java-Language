class CasioCalci
{
    void add(int i,int j)
    {
       int result;
       result=i+j;
       System.out.println(result); 
    }
    //multiple methods with same name and different parameters is known as method overloading
    //compiler takes care to call which method based on parameters given
    void add(int i,int j,int k)
    {
        int result;
        result=i+j+k;
        System.out.println(result);
    }
}
public class MethodOverloadingDemo 
{
    public static void main(String []args)
    {
        CasioCalci obj=new CasioCalci();
        obj.add(2,3);
        obj.add(2,5,6);
    }
    
}
