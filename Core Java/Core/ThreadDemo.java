
public class ThreadDemo {
	public static void main(String[] args)  {
		
		Thread th = Thread.currentThread();
		System.out.println("Current Thread : " + th.getName());
		th.setName("Main Thread");
		System.out.println("Current Thread : " + th.getName());
		
		
		ChildThread ct = new ChildThread();
		System.out.println("Current Thread : " + ct.getName());
		ct.start();
		Thread ct1 = new Thread(new Cthread());
		Cthread ct2 = new Cthread();
		//ct2.run();
		try {
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}	
		
		ct1.start();
		
		
	}
}

class ChildThread extends Thread
{
	public void run()
	{
		
		for (int i=1; i<=10; i++)
			System.out.println("i -> " + i);
	}
}

class Cthread implements Runnable
{
	public void run()
	{
		for (int j=1; j<=10; j++)
			System.out.println("j -> " + j);
		
	}
}