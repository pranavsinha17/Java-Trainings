package Lab5;
 class Fibonacci{
	 public int nonRecurFib(int count)
	 {
	 int n1=0,n2=1,n3,i;    
	 System.out.print(n1+" "+n2);    
	    
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }
	return 0; 
 }
	public int fib(int n)
	{
	if(n==0||n==1)
	return n;
	return fib(n-1)+fib(n-2);
	}
	public void getFibSeries(int n)
	{
	System.out.println("Fibonacci Series");
	for(int i=0;i<n;i++)
	{
	System.out.println(fib(i));
	}
	}
}
public class Exercise2 {
	public static void main(String [] args)
	{
Fibonacci f=new Fibonacci();
f.getFibSeries(5);
f.nonRecurFib(5);
}
}
