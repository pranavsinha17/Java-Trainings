package Lab1;
class Musafir{
	private double n;
	
	Musafir(double n)
	{
		this.n=n;
	}
   
	
    
    double calculateDifference(){
    double sumSquare=(n*(n+1)*((2*n)+1))/6;
        double squareSum=Math.pow((n*(n+1)/2),2);
		 return  Math.abs(sumSquare-squareSum);
	}
}
public class Exercise2 {
	public static void main(String []args)
	{
	Musafir m=new Musafir(7);
    System.out.println(m.calculateDifference());
}
}
