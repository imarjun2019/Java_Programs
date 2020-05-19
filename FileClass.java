import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException{
		// It represents the metadata of the file.
		// A file class is the abstract representation of the file and directory pathnames.
		File f1 = new File("C:/Users/imarjun2014/Desktop/Java JNIT Class/Programs/File Handling/FileClass.txt");
		f1.createNewFile();
		System.out.println(f1.canWrite());
		System.out.println(f1.exists());
		// Provides the total number of characters or bytes in a file.
		System.out.println(f1.length());
		// Gives the name of the file.
		System.out.println(f1.getName());
		// Provides the file path
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getAbsoluteFile());
		// Deletes the file
		f1.delete();	
	}
}
