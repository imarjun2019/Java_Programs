import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader rd = new FileReader("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\fileout.txt");
		BufferedReader br = new BufferedReader(rd);
		
		int i;
		String st = br.readLine();
		System.out.println(st);
		
		while ((i=br.read())!=-1)
		{
			
			System.out.print((char)i);	
		}	
		
		// Use of the BufferedReader Methods: readline() 
		FileReader fr = new FileReader("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt");
		BufferedReader brd = new BufferedReader(fr);
		
		// It reads the first line of the file.
		String str;
		while ((str=brd.readLine())!=null)
			{
				System.out.println(str);
			}
		
		
		// read(char[] ch, int off, int len).It is the overloaded method of read().
		FileReader frd = new FileReader("C:/Users\\imarjun2014\\Desktop\\Java\\FileHandling\\xyz.txt");
		BufferedReader bre = new BufferedReader(frd);
		
		char[] s = new char[20];
		//It will read the 10 character from the array but it will start from the index position 6 to store the characters.
		bre.read(s,6,10);
		System.out.println(s);
		
		
		
		rd.close();

		
	}
}

