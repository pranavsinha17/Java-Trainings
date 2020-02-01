package Lab6;

import java.util.Scanner;

class Test{
	private String s;
	private String [] str=new String[50];
	Test(String s)
	{
		this.s=s;
	}
	boolean validateLast()
	{
	
		str=s.split("_",0);
		if(!(str[str.length-1].equals("job")))
			return false;
		return true;
	}
	boolean validateLeft()
	{
		if(validateLast()==false)
		{
			if(s.length()<8)
				return false;
			return true;
		}
		else {
		int cnt=0;
		for(int i=0;i<str.length-1;i++)
		{
			cnt+=str[i].length();
		}
		if(cnt<8)
		return false;
		}
	return true;	
	}
	boolean validate()
	{
		if(validateLast()&&validateLeft())
		return true;
	return false;	
	}
}
public class Exercise10 {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String username=sc.nextLine();
	Test t=new Test(username);
	if(t.validate())
	{
		System.out.println("Username is valid");
	}
	else {
		if(t.validateLast()==false&&t.validateLeft()==true)
		{
			System.out.println("Username must end with _job");
		}
		else if(t.validateLeft()==false && t.validateLast()==true)
		{
			System.out.println("Username must contain atleast 8 words excluding _job");
		}
		else if(t.validateLeft()==false&&t.validateLast()==false)
		{
			System.out.println("Username must end with _job");	
			System.out.println("Username must contain atleast 8 words excluding _job");
		}
	}
	sc.close();
}
}
