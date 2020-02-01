package Lab10;
interface Factorial {
	public int getFactorial(int num);

}
public class Exercise5 {
	static int result = 1;
	public static int getfactorialresult(int num)
	{
	       if(num==0)
			return result;
		
		return result=num*getfactorialresult(num-1);
	}
	public static void main(String ar[])
	{
		Factorial consumer=Exercise5::getfactorialresult;
		System.out.println(consumer.getFactorial(5));
	}

}
