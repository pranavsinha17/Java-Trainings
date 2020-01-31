package Lab7;

import java.util.HashMap;
import java.util.Map;

class SquareMap{
	public Map<Integer,Integer> getSquares(int [] arr)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int  i=0;i<arr.length;i++)
		{
			map.put(arr[i],arr[i]*arr[i]);
		}
		return map;
	}
}
public class Exercise3 {
public static void main(String[] args)
{
	SquareMap sq=new SquareMap();
	int arr[]= {4,6,2,5,9};
	System.out.println(sq.getSquares(arr));
}
}
