package Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Sorted{
	public int[] getSorted(int a[])
	{
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
			s+=(Integer.toString(a[i])+",").trim();
			else if(i==a.length-1)
				s+=(Integer.toString(a[i])).trim();
		}
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String[] strArr=sb.toString().split(",");
		int[] res = new int[strArr.length];
		for(int i=0;i<strArr.length;i++)
		{
			res[i]=Integer.parseInt(strArr[i]);
		}
		Arrays.sort(res);
	return res;
	}
}
public class Exercise7 {
public static void main(String[] args)
{
	Sorted s=new Sorted();
	int a[]= {54,65,77,98};
	int b[]=s.getSorted(a);
	for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
}
}
