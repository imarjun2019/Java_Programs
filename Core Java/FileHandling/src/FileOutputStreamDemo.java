import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileOutputStream fout = new FileOutputStream("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\fileout.txt",true);
		
		String name = "\nCOVID-19 Sucks";
		
		char ch[] = name.toCharArray();
		
		for (int i = 0; i<name.length(); i++)
		{
			try {
				fout.write(ch[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//fout.close();
		}
		
		String source = "The year 2020 will be remembered by everyone";
		byte [] b = source.getBytes();
		FileOutputStream f1 = null;
		
		try
		{
			f1 = new FileOutputStream("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt",true);
			
			// write to the file
			for (int j=0; j<b.length;j++)
			{
				f1.write(b[j]);
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fout.close();
			f1.close();
		}
		
		

	}
}
