package Lab9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1 {
public static void main(String[] args)
{
	ExecutorService executer=Executors.newSingleThreadExecutor();
	executer.execute(new Runnable() {
		public void run()
		{
			try {
				BufferedReader br=new BufferedReader(new FileReader("source.txt"));
				FileWriter fr=new FileWriter("target.txt",true);
				String st;
				while((st=br.readLine())!=null)
				{
					fr.write(st);
					String arr[];
					int r=0;
					arr=st.split("");
				    for(int i=0;i<arr.length;i++)
				    {
				    	//System.out.println(arr[i]);
				    	r++;
				    	if(r==10)
					    {
					    	System.out.println("10 Characters are copied");
					    	Thread.sleep(5000);
					    	r=0;
					    }
				    	
				    }
				    
					fr.flush();
					br.close();
					fr.close();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	executer.shutdown();
	
}

}
