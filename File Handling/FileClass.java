import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileClass {

	public static void main(String[] args) throws IOException
	{
		
		FileDemo fd = new FileDemo();
		try {
			fd.FileDemo1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DirFileDemo demo = new DirFileDemo();
		demo.DirFileDemo2();
		
		
		String dirName = "C:\\Users\\imarjun2014\\Desktop\\Java JNIT Class\\Programs";
		File f4 = new File(dirName);
		
		FilenameFilter fileext = new extFile("class");
		String z[] = f4.list(fileext);
		//System.out.println(fileext);
		
		
		for (int i=0; i<z.length; i++)
		{
			System.out.println(z[i]);
	}
		
		
	}
}

class FileDemo 
{
	
	void FileDemo1() throws Exception
	{
	// It represents the metadata of the file.
	// A file class is the abstract representation of the file and directory pathnames.
	File f1 = new File("C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling\\File.txt");
	f1.createNewFile();
	//returns true is the file is writable.
	System.out.println("Can Write " + f1.canWrite());
	// Returns true if the file exists.
	System.out.println("Exists "+f1.exists());
	// Provides the total number of characters or bytes in a file.
	System.out.println("Length " +f1.length());
	// Gives the name of the file.
	System.out.println("Name "+f1.getName());
	// Provides the file path
	System.out.println("Absolute Path "+f1.getAbsolutePath());
	System.out.println("Absolute File " + f1.getAbsoluteFile());

	// Returns the name of the parent directory
	System.out.println("Parent Directory " + f1.getParent());
	//returns true if the file is readable.
	System.out.println("Can read "+f1.canRead());
	// returns true if it is a directory else false
	System.out.println("Is Directory " + f1.isDirectory());
	// returns true if called on a file and false if called on a directory
	System.out.println("Is file " + f1.isFile());
	// Returns true if the path is absolute else false if it is relative
	System.out.println("Is Absolute " + f1.isAbsolute());
	// Returns true upon successful rename else false.
	File dest = new File ("C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling\\xyz.txt");
	System.out.println("Renamed " + f1.renameTo(dest));
	System.out.println("New Name " + f1.getName());
	
	File dir = new File ("C:\\\\Users\\\\imarjun2014\\\\Desktop\\\\Java\\\\FileHandling"+ "\\" + "New Directory");
	System.out.println("Directory made is " + dir.mkdir());
	
	// Deletes the file
	//f1.delete();
	}
	 
	 
}
		
class DirFileDemo
{
		void DirFileDemo2()
		{
			// Inside a directory file
			String dir = "C:\\Users\\imarjun2014\\Desktop\\Java\\FileHandling"; 
			File f2 = new File(dir);
			
				if (f2.isDirectory())
				{
					// Prints out the directory path:
					System.out.println("Directory of " + f2 + "\n");
					
					// Lists all the available directories and files inside the directory in String array.
					String s[] = f2.list();
					System.out.println(Arrays.toString(s) + "\n");
					
						for (int i=1; i<s.length; i++)
						{
							File f3 = new File (dir + "//" + s[i]);
							//System.out.println("F3 = " + f3);
							if (f3.isDirectory())
							{
								System.out.println(s[i] + " is a directory inside " + f2.getName() +"\n");
								String k[] = f3.list();
								System.out.println(Arrays.toString(k) + " list of " + s[i] + "\n");
								
								for (int j=1; j<k.length; j++)
								{
									File f4 = new File (f3 + "//" + k[j]);
									//System.out.println("F4 = " + f4);
									if (f4.isDirectory())
									{
										System.out.println(k[j] + " is a directory inside " + f3.getName());
									}
									
									else
										System.out.println(k[j] + " is a file insdie " + f3.getName());
								}
							
							}
							else 
								System.out.println(s[i] + " is a file insdie " + f2.getName());
						}
					}
					else
						System.out.println("It is not a directory");	
			}
}



// Must override accept method in FilenameFilter interface.
class extFile implements FilenameFilter
{
	String ext;
	extFile (String ext)
	{
		this.ext = ext;
	}
	public boolean accept (File dir, String name) {
		return name.endsWith(ext);
		
	}
	
}
	