package Lab10;
interface auth{
	String user="happy";
	String pass="heer";
	 boolean verification(String user,String pass);
	
}
public class Exercise3 {
public static void main(String[] args)
{
	auth a=(String user,String pass)->{
		
			return auth.user==user&&auth.pass==pass;
		
	};
	System.out.println(a.verification("happy", "heer"));
}
}
