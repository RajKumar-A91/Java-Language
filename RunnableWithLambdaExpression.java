public class RunnableWithLambdaExpression {
    public static void main(String args[]) {

        /*Runnable obj=new Runnable() {
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.pritln("hii");
                }
            }
        };
        */
        //now using lambda expression 
        Runnable obj= () ->{
                for(int i=0;i<5;i++) {
                    System.out.println("hii");
                }
            };
        Thread t=new Thread(obj);
        t.start();
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++) {
                System.out.println("hello");
            }
        }
        );
        t1.start();
        //here we used lambda expression
        //and we used ananymous class
        //therefore the code is more efficient with less no.of lines

        

    }
    
}
