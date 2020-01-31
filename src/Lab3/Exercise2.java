package Lab3;

import java.util.Arrays;

class Strings{
	public String getSorted(String str)
	{
		char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
        
	}
	public String generate(String s)
	{
		String res=getSorted(s);
		char[] str=res.toCharArray();
		if(str.length%2==0)
		{
			for(int i=0;i<str.length/2;i++)
			{
				if(str[i]>=97&&str[i]<=123)
				str[i]-=32;
			}
			for(int i=str.length/2+1;i<str.length;i++)
			{
				if(str[i]>=65&&str[i]<=91)
				str[i]+=32;
			}
			
			
		}
		
		else {
			for(int i=0;i<str.length/2+1;i++)
			{
				if(str[i]>=97&&str[i]<=123)
				str[i]-=32;
			}
			
			for(int i=str.length/2+2;i<str.length;i++)
			{
				if(str[i]>=65&&str[i]<=91)
				str[i]+=32;
			}
			
		}
//		for(int i=0;i<str.length;i++)
//			System.out.println(str[i]);
		return new String(str);
	}
}
public class Exercise2 {
	public static void main(String []args)
	{
		Strings s=new Strings();
		String str="bacg";
		String res="";
		res=(String)(s.generate(str));
	System.out.println(res);
	}

}