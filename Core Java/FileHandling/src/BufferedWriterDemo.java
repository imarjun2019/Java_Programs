import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileWriter f0 = new FileWriter ("C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling\\abc.txt",true);
		BufferedWriter bf = new BufferedWriter(f0);
		
		bf.write("\nHello World!");
		System.out.println("\n");
			
		
		char ch;
		for (ch='a';ch<='z';ch++)
		{
			bf.write(ch + " ");
			
		}
		bf.close();	

	}

}
