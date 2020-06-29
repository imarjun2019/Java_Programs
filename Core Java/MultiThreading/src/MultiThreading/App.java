package MultiThreading;

public class App {
	// main method represents main thread
	public static void main(String[] args) {
		
		// whatever we write here will be executed by the main thread.
		// threads always execute the jobs in a sequence.
		
		
		System.out.println("==== Application Started =====");
		
		// Child Thread.
		MyTask mt = new MyTask();
		
		// Now, main thread and child thread are executing parallelly. 
		mt.start(); // --> Start will internally execute the run method in MyTask Thread.
		
		for (int doc=1; doc<=10; doc++) {
			System.out.println("^^ Print Document # " + doc + " printer 1 ");
		}
		
		
		System.out.println("=== Application Finished ===");
		
	}

}

//MyTask IS-A Thread. (Inheritance concept).
class MyTask extends Thread{
	@Override //Overrides the run method in Thread.
	public void run()
	{
		for (int doc =1 ; doc<=10; doc++)
		{
			System.out.println("@@ Printing document # " + doc + " printer 2");
		}
	}
	
}






