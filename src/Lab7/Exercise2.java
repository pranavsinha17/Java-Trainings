package Lab7;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Frequency{
	public Map<Character,Integer> countCharacter(char[] c)
	{
		
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<c.length;i++)
		{   Integer value=map.get(c[i]);
		if(value!=null)
		{
			map.put(c[i],value+1);
		}
		else {
				map.put(c[i],1);
		}
		}
		return map;
	}
}
public class Exercise2 {
public static void main(String[] args)
{
	char []c= {'A','P','P','L','E'};
	Frequency fr=new Frequency();
	System.out.println(fr.countCharacter(c));
}
}


