package Lab6;

import java.util.StringTokenizer;
class StringsTok{
	public void stringTokenize()
	{
	StringTokenizer st =new StringTokenizer("1 2 3 4 5 6 7 8 9 10"," ");
	int ans=0;
	while(st.hasMoreTokens())
	{
		int val=Integer.parseInt(st.nextToken());
		ans+=val;
		System.out.println(val);
	}
	System.out.println("Sum is "+ans);
}
}
public class Exercise1 {
public static  void main(String[] args)
{
	StringsTok s=new StringsTok();
	s.stringTokenize();
}
}
