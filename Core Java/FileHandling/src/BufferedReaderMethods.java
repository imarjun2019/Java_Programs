import java.io.*;

public class BufferedReaderMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader rd = new FileReader("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt");
		BufferedReader br = new BufferedReader(rd);
		
		// It reads the first line of the file.
		String st;
		while ((st=br.readLine())!=null)
			{
				System.out.println(st);
			}
		
		
		
		rd.close();

	}

}
