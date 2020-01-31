package Lab6;
import java.io.*;
public class Exercise2 {
public static void main(String[] args)
{
	File file =new File("student.txt");
	try {
		BufferedReader br=new BufferedReader(new FileReader(file));
		String st;
		int cnt=1;
		try {
			while((st=br.readLine()) != null)
			{
				System.out.println(cnt++ +" "+st);
			}
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
