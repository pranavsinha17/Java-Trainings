package Lab3;

import java.util.Arrays;
import java.util.Scanner;
class ReverseSort{
	public int  reverse(int num)
	{
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
	}
	
	public  int[] getSorted(int intArr[] )
	{
		for(int i=0;i< intArr.length;i++)
		{
			intArr[i]=reverse(intArr[i]);
		}
		System.out.println( "reverse form ");
		for(int i=0;i< intArr.length;i++)
		{
			System.out.println( intArr[i]);
		}
		System.out.print( "\n");
		return intArr;
	}
	public  void displaySortArray(int intInteger[])
	{
		Arrays.sort(intInteger,0,intInteger.length);
		System.out.println( " reverse sorted");
		for(int i=0;i<intInteger.length;i++)
		{
			System.out.println( intInteger[i]);
		}
		System.out.print( "\n");
	}
	

}
public class Excercise3 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int intInteger[];
		int n;
		System.out.println("no of element : " );
		n=sc.nextInt();
		intInteger=new int[n];
		for(int i=0;i<n;i++)
		{
			intInteger[i]=sc.nextInt();
		}
		System.out.println( "display integer array");
		for(int i=0;i<n;i++)
		{
			System.out.println( intInteger[i]);
		}
		System.out.print( "\n");
		ReverseSort rs=new ReverseSort();
		
		
		 rs.getSorted(intInteger);
		 rs.displaySortArray(intInteger);
	}

}
