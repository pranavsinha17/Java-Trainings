package Lab1;
import java.util.*;
class Calc{
	public int calcSum(int n)
	{
		int sum=0;
        for(int i=1;i<=n;i++){
      if(i%3==0||i%5==0)
        {
        sum+=i;
        }} 
        return sum;
        
	}
}
public class Exercise1 {
	public static void main(String[] args)
	{
	Calc c=new Calc();
	System.out.println(c.calcSum(5));
	}

}
