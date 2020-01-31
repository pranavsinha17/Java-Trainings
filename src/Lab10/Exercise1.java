package Lab10;
interface power{
	void func(int x,int y);
}
public class Exercise1 {
public static void main(String[] args)
{
	power p=(int x,int y)->System.out.println(Math.pow(x, y));
	p.func(2, 3);
}
}
