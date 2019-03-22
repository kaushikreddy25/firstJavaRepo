package self_learning;
import java.io.*;

public class FileCheck 
{

	public static void main(String[] args) 
	{
		File f = new File("W:\\Java\\The New Boston Tutorials\\Java.txt");
		
		if 	(f.exists())
				System.out.println(f.getName() + " Exists");
		else
			
			{
				System.out.println("File doesn't exist");
			}
		 //apply File class methods on File objects
		System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable "+f.canWrite()); 
            System.out.println("Is readable "+f.canRead()); 
            System.out.println("Is a directory "+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
        } 
		
	}

}
