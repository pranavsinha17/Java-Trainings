package Lab6;
class Positive
{
	public boolean checkPositive(String str)
	{
		Character c=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
		   if(c>str.charAt(i))
		   {
			   return false;
		   }
		   c=str.charAt(i);
		}
		return true;
	}
}
public class Exercise8 {
public static void main(String[] args)
{
	Positive p=new Positive();
	System.out.println(p.checkPositive("ANT"));
}
}
