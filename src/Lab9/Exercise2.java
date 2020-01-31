package Lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {
	static int timer=0;
public static void main(String[] args)
{
	ExecutorService executer=Executors.newSingleThreadExecutor();
	executer.execute(new Runnable() {
		public void run()
		{
			while(timer!=10)
			{
				
			    try {
			    	System.out.println("Countdown: "+ timer);
					Thread.sleep(1000);
					timer++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    if(timer==10)
			    	timer=0;
			   
			}
			 //timer=0;
			
			
		}
		
	});
	executer.shutdown();
}
}
