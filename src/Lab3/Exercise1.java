package Lab3;

import java.util.Arrays;

class Minimum{
	public int getSecondSmallest(int a[])
	{
		Arrays.sort(a);
		return a[1];
		
	}
	public int secondMinElement(int b[])
	{
		int min1=b[0];
		int min2=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>min1)
			{
				min2=min1;
				min1=b[i];
			
		}
			else if (b[i]>min2)
			{
				min2=b[i];
			}
		}
		return min2;
	}
	
}
public class Exercise1 {
	public static void main(String [] args)
	{
	int a[]= {5,65,74,3,23};
	Minimum m=new Minimum();
	System.out.println(m.getSecondSmallest(a));     //O(nlogn)
	System.out.println(m.getSecondSmallest(a));      // O(n)
	
}
}
