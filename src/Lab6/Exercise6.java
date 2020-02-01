package Lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class FileClass{
	public void getProperties() {
		File file=new File("student.txt");
		int cnt=0;
		int spaceCount=0;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String st;
			String res="";
			int r =0;
			try {
				
				while((st=br.readLine())!=null)
				{
					cnt++;
					res+=st+" ";
				}
				System.out.println("No. of lines in file: "+cnt);
				String[]str=res.split(" ");
				
				for(int i=0;i<str.length;i++)
				{
					if(str[i].equals(""))
						spaceCount++;
				}
				System.out.println("No. of words in file: "+ ((str.length)-spaceCount));
				for(int i=0;i<str.length;i++)
				{
					r+=str[i].length();
				}
				System.out.println("No. of characters in file: "+ r);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

public class Exercise6 {
public static void main(String[] args)
{
	FileClass file=new FileClass();
	file.getProperties();
	
}
	}
