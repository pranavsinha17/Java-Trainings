package Lab7;
import java.util.Arrays;
class ReverseSet{
	public int [] getDistinctReverse(int a[]) {
		boolean visitor[]=new boolean[500];
		int [] decendDist=new int[a.length+1];
		for(int i=0;i<visitor.length;i++)
			visitor[i]=false;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(visitor[a[i]]==false)
			{
			visitor[a[i]]=true;
			decendDist[i]=a[i];
			}
		}
		
			//Arrays.sort(a, Collections.reverseOrder());->will work with Integer array but not with int[]
		for(int i=0;i<decendDist.length;i++)
		{
		decendDist[i]=decendDist[i]*(-1);	
		}
		Arrays.sort(decendDist);
		for(int i=0;i<decendDist.length;i++)
		{
			decendDist[i]=decendDist[i]*(-1);
		}
		return decendDist;
		
	}
}
public class Exercise8 {
public static void main(String[] args)
{
	ReverseSet r=new ReverseSet();
	int a[]= {1,2,9,1,2,9};
	int b[]=r.getDistinctReverse(a);
	for(int i=0;i<b.length;i++)
		if(b[i]!=0)
		System.out.print(b[i]+" ");
	
	
}
}
