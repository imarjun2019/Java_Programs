package MultiThreading;

public class RunnableDemo {
	// main method represents main thread
	public static void main(String[] args) {
		
		// whatever we write here will be executed by the main thread.
		// threads always execute the jobs in a sequence.
		
		
		System.out.println("==== Application Started =====");
		
		// Child Thread.
		Thread mt = new Thread(new MyTask1());
		
		/*
		 Thread mt = new Thread (new MyTask1()); 
		 
		  ALternate way:
		  
		  Runnable r = new Mytask1();
		  Thread mt = new Thread(r);
		 */
		
		// Now, main thread and child thread are executing parallelly. 
		mt.start(); // --> Start will internally execute the run method in MyTask Thread.
		
		for (int doc=1; doc<=10; doc++) {
			System.out.println("^^ Print Document # " + doc + " printer 1 ");
		}
		
		
		System.out.println("=== Application Finished ===");
		
	}

}

//If you have a class that is a subclass of super class or you are using inheritance, you can use implements Runnable.
//Its because Java does not support multiple inheritance. i.e Class Super extends Child1,Thread.
//In these scenarios you can Runnable. i.e Class Super extends Child1 implements Runnable.

//MyTask IS-A Thread. (Inheritance concept).
class MyTask1 extends CA implements Runnable{
	@Override //Overrides the run method in Thread.
	public void run()
	{
		prints();
	}
	
}


class CA
{
	void prints()
	{
		for (int doc =1 ; doc<=10; doc++)
		{
			System.out.println("@@ Printing document # " + doc + " printer 2");
		}
	}
	
}

