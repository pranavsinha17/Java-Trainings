package Lab6;
class Image{
	
	public String getImage(String str)
	{
		String res="";
		StringBuffer s=new StringBuffer();
		s.append(str);
		s.reverse();
		res+=str;
		res+="|";
		res+=s.toString();
		return res;
	}
}
public class Exercise3 {
	public static void main(String [] args)
	{
		Image t=new Image();
		System.out.println(t.getImage("EARTH"));
	}

}
