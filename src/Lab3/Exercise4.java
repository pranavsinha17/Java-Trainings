package Lab3;
class Frequency{
	 public void findOccurence(char a[])
		{
		int freq[]=new int[1000];
		for(int i=0;i<a.length;i++)
		{
		  freq[a[i]]++;
		}

		for(int i=0;i<a.length;i++)
		{
			if(freq[a[i]]!=0)
		System.out.println(a[i]+" "+freq[a[i]]);
		freq[a[i]]=0;
		}
		}
}
public class Exercise4 {
	public static void main(String [] args)
	{
		Frequency f=new Frequency();
	char a[]={'a','b','b','a','s'};
	f.findOccurence(a);
	}
}
