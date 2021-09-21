class Calci{
    public static int add(int ...n)
    //this is nothing but an array when we say ...i
    //{2,3,4} variable length arguments
    {
        int sum=0;
         for(int i:n){
             sum+=i;
             

         }  
         return sum;
    }
}
public class VarargsDemo {
    public static void main(String []args){
        //Varargs stands for variableArguments ,variable length arguments
        System.out.println(Calci.add(2,3,4,10));
    }
    
}
