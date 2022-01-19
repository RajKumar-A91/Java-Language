class Mythread implements Runnable{
    public void run(){
        int arr[]={1,2,3,5,6};
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ThreadsUsingRunnableInterface {
    public static void main(String args[]){
        Mythread obj=new Mythread();
        //Runnable interface only has run method it doesnot have start method 
        //so we can pass our thread object in Thread constructor and call start method in Thread class
        Thread t1=new Thread(obj);
        t1.start();
        //obj.run();

    }
    
}
