package Lab8;
class Methods implements Runnable{
	private int timer=0;
	@Override
	public void run() {
		while(timer!=10)
		{
			
		    try {
		    	System.out.println("Countdown: "+timer++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    if(timer==10)
		    	timer=0;
		   
		}
		 //timer=0;
		
		
	}
	
}
public class Exercise2 {
public static void main(String[] args)
{
	Methods m=new Methods();
	Thread t=new Thread(m);
	t.start();
}
}
