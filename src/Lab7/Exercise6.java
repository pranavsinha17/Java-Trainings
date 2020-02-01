package Lab7;

import java.util.*;
class Test{
Test()
{

}
public List<Integer> votersList(Map<Integer,Date> hmap)
{
        List<Integer> list=new ArrayList<Integer>();
		Date d=new Date();
		for (Map.Entry mapElement : hmap.entrySet()) { 
            int key = (Integer)mapElement.getKey(); 
            int value =Math.abs((((Date) mapElement.getValue()).getYear()+1900)-(d.getYear()+1900));
            //System.out.println(value);
           if(value>=18)
           {
        	   list.add(key);
           }
        }
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
return list;		
  
}
}
public class Exercise6 {
	public static void main(String[] args)
	{
	Test t=new Test();
	Map<Integer,Date> hmap=new HashMap<Integer,Date>();
	hmap.put(2,new Date("2018/09/01"));
	hmap.put(56,new Date("1980/09/01"));
	hmap.put(3,new Date("1945/09/01"));
	hmap.put(5,new Date("2012/09/01"));
	
	t.votersList(hmap);
	
	}

}
