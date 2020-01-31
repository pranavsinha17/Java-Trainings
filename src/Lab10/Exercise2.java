package Lab10;
interface strings{
	public String putSpace(String s);
}
public class Exercise2 {
public static void main(String[] args)
{
	strings str=(String s)->{
		String res="";
		for(int i=0;i<s.length();i++)
			res+=s.charAt(i)+" ";
		return res;
	};
	System.out.println(str.putSpace("Hello"));
}
}
