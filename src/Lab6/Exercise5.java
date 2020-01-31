package Lab6;
class Modify{
	public int modifyNumber(int n)
	{
		String s=Integer.toString(n);
		StringBuffer sb=new StringBuffer(s);
		int i=0,j=1;
		while(i<sb.length()-1 && j<sb.length())
        sb.setCharAt(i, (char) (Math.abs(Integer.parseInt(Character.toString(sb.charAt(j++)))-Integer.parseInt(Character.toString(sb.charAt(i++))))+'0'));   
		
		
		return Integer.parseInt(sb.toString());
	
	}
}
public class Exercise5 {
public static void main(String[] args)
{
	Modify m=new Modify();
	System.out.println(m.modifyNumber(45862));
}
}
