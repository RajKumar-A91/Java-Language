public class WrapperDemo {
    
    /*
    *primitive datatypes are always faster than wrapping classes
    *the main reason for using wrapper classes
    *some Applications in java like Hybernates and Collection API
    *they only work with wrapper classes
    *For normal applications we can use Primitive datatypes.
    */
    
    public static void main(String args[])
    {
        int i=5;//primitive datatype
        Integer j=new Integer(i);
        Integer value=i;//this autoBoxing or autoWrapping
        //when we put primitive value inside a object is known as Boxing in java it
        //is known as wrapping
        int k=j.intValue();//unboxing or unwrapping. intValue() method is used to fetch value
        int n=value;//autoUnBoxing or autoUnwrapping
        //wrapper class
        //here Integer is class and we are creating a refference and object of 
        //Integer wrapper class
        Byte b=new Byte("raj");
        Short s=new Short("raj");
        Float f=new Float(1.1f);
        Double d=new Double(5.5);
        Character c=new Character('r');
        Long l=new Long(6);
        Boolean bo=new Boolean(true);
        String str="123";
        int st=Integer.parseInt(str);//this parseInt method takes string 
        //and returns int value of it
        //parseInt() method is of static type so we use class to access it
        //ie is Integer class
        
    }
    
}
