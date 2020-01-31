package Lab6;
class Strings{
	public String alterString(String s)
	{
		StringBuffer str = new StringBuffer();
		str.append(s);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				continue;
			}
			str.setCharAt(i, (char) (str.charAt(i)+1));
			
		}
		return str.toString();
		
	}
}
public class Exercise4 {
	public static void main(String[]args)
	{
Strings s=new Strings();
 System.out.println(s.alterString("Java"));
}
}
