/**
 * 
 */
package com.Telusko;

/**
 * @author ARK
 *
 */
class Mythread extends Thread
{
	int a[]= {1,3,5,7,9,11};
	public void run()
	{
		for(int i=0;i<6;i++) 
		{
			a[i]=a[i]*2;
			System.out.println(a[i]+"hii");
				try{Thread.sleep(500);}
				catch(Exception e) {}
			
	    }
	
    }
}
class Mythread1 extends Thread
{
	int b[]= {5,10,15,20,25,30};
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			b[i]=b[i]*2;
			System.out.println(b[i]+"hello");
			try {Thread.sleep(500);}catch(Exception e) {}
			
		}
	}
}
public class MultiThreading 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		//multithreading is a unit of process
		/*
		 * ms world- main process
		 * typing -sub process
		 * spell check-sub process
		 */
        //The purpose of threads
		//threads helps in using cpu efficiently
		//multitasking
		//Thread is a inbuilt class in java
		//every thread needs a method called run method
		//user defined threads are classes with run method which extends Thread class 
		//and we need create an object of user defined thread class
		//and we need call start method for starting the execution of thread
		//we don't need to call run method
		//if we call start method it will automatically calls run method
		//we can write code that need to be executed in run method
		//A Thread has multiple methods like start,run,sleep-->is a static method which takes milliseconds as input
	    Thread th=new Mythread();
	    Thread th1=new Mythread1();
	    th.start();
	    Thread.sleep(10);
	    th1.start();
	    //as we know java cannot support multiple inheritance 
	    //so if we want to extend an another class along with Thread class it is not possible
	    //so we there is a interface called Runnable 
	    //by this also we can create a Thread
	    //Runnable interface has run method
	    //by Runnable we can acheive same properties of Thread class
	    //we can execute two threads parallely
		
	}

}
