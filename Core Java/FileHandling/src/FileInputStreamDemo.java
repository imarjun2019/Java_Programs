import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f0 = new FileInputStream("C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt");
		int i;
		do {
			i = f0.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
		}while(i!=-1);
		
		
		// Psssing file object as an parameter for the constructor.
		File dir = new File ("C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt");
		FileInputStream f1 = new FileInputStream(dir);
		int j;
		do {
			j = f1.read();
			if(j!=-1)
			{
				System.out.print((char)j);
			}
		}while(j!=-1);
		
		
		f0.close();
		f1.close();
		
	}

}



