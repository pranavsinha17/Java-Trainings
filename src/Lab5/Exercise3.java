package Lab5;

import java.util.Scanner;

class Prime{
	public String prime(int n)
	{
	Boolean flag=true;
	for(int i=2;i<n;i++)
	{
	if(n%i==0)
	{
	flag=false;
	return "not prime";
	}
	}
	//if(flag==true)
	return "prime";
	}
	public void getPrimeSeries(int n)
	{
	System.out.println("Prime Series");
	for(int i=2;i<n;i++)
	{
	if(prime(i)=="prime")
	System.out.println(i);
	}
	}
}
public class Exercise3 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Prime p=new Prime();
	p.getPrimeSeries(n);
}
}
