package Lab4;
class Cube{
	public int cubeSum(int n)
	{
		int ans=(int) Math.pow((n*(n+1)/2),2);
		return ans;
	}
}
public class Exercise1 {
public static void main(String[] args)
{
Cube c=new Cube();
System.out.println(c.cubeSum(3));
}
}
