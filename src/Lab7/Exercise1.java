package Lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Map1{
	public List<Map<Integer, Integer>> generateMap(Map<Integer,Integer> hmap){
		List<Map<Integer,Integer>> arlist=new ArrayList<Map<Integer,Integer>>();
		arlist.add(hmap);
		return arlist;
	} 
}
public class Exercise1 {
public static void main(String[] args)
{
	Map<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	hmap.put(2,2);
	hmap.put(3,4);
	hmap.put(1,3);
	hmap.put(7,8);
	Map1 m=new Map1();
	System.out.println(m.generateMap(hmap));
}
}
