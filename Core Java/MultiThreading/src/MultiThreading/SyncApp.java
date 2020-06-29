package MultiThreading;

public class SyncApp {
	
	// Main is representing the main thread.
	public static void main(String[] args) {
		System.out.println("=== Application Started ===");
		
		// Main Thread
		Printer printer = new Printer();
		//printer.printDocuments(12,"Sam.pdf");
		
		//Scenario is that we have multiple thread working on the same Printer Object.
		//If Multiple Threads are going to work on the same Object we must Synchronize them.
		
		// Child Thread
		MyThread th = new MyThread (printer); //MyThread is having a reference to the Printer object.
		th.start();
		
		//join() can run the threads synchronized. i.e It will finish one thread and move to another.
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Child Thread
		YourThread yt = new YourThread (printer); // YourThread is also having the reference to the Printer Object.
		yt.start();
		
		System.out.println("=== Application Closed ===");	
		
	}

}

class Printer
{
	void printDocuments (int num, String docName)
	{
		for (int i=1; i<=10; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing " + docName + " " + i);
		}
	}
}

class MyThread extends Thread
{
	Printer pref;
	
	
	public MyThread(Printer pref) {
		super();
		this.pref = pref;
	}


	@Override
	public void run()
	{
		pref.printDocuments(10,"Arjun.pdf");
		
	}
}

class YourThread extends Thread
{
	Printer pref;
	
	
	public YourThread(Printer pref) {
		super();
		this.pref = pref;
	}


	@Override
	public void run()
	{
		pref.printDocuments(10,"Bimal.pdf");
		
	}
}