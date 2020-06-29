import java.io.FileOutputStream;
public class FileOutputStreamDemo 
{
	public static void main (String args[]) throws Exception
	{
		int i;
		FileOutputStream f1 = new FileOutputStream ("C://Users//imarjun2014//Desktop//Java JNIT Class//Programs//File Handling//FileOutputStream.txt",true);
		String name = "ARJUN";
		
		char[] ch = name.toCharArray();
		
		for (i=0; i<name.length(); i++)
		{
			f1.write(ch[i]);
		}
		f1.close();
	}

}
