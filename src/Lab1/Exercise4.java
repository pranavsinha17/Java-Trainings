package Lab1;
class Power{
	public Boolean checkPower(int n)
	{
		int mult=1;
  while(mult!=n)
  {
	  mult*=2;
	  if(mult==n)
	  {
		  return true;
	  }
	  else if(mult>n)
		  break;
	  
  }
  return false;
	}
}
public class Exercise4 {
	public static void main(String[] args)
	{
Power p=new Power();
System.out.println(p.checkPower(35));
}
}
