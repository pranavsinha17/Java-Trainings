package Lab6;

import java.io.File;

public class Exercise7 {
	public static String getExtention(File f1)
	{
		String fileName=f1.getName();
		 if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
		        return fileName.substring(fileName.lastIndexOf(".")+1);
		        else return "";
		    }
public static void main(String[] args)
{
	 File f = new File("student.txt"); 
	  
     //apply File class methods on File object 
     System.out.println("File name :"+f.getName()); 
     System.out.println("Path: "+f.getPath()); 
     System.out.println("Absolute path:" +f.getAbsolutePath()); 
     System.out.println("Parent:"+f.getParent()); 
     System.out.println("Exists :"+f.exists()); 
     if(f.exists()) 
     { 
         System.out.println("Is writeable:"+f.canWrite()); 
         System.out.println("Is readable"+f.canRead()); 
         System.out.println("Is a directory:"+f.isDirectory()); 
         System.out.println("File Size in bytes "+f.length()); 
         System.out.println("File Extention :"+getExtention(f));
     } 
}
}
