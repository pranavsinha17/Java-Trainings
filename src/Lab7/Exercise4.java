package Lab7;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Student{
	public HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hmap)
	{
		HashMap<Integer,String> hm=new LinkedHashMap<>();
		 for (Entry<Integer, Integer> entry : hmap.entrySet())  
		 {
			 if(entry.getValue()>=90)
				 hm.put(entry.getKey(),"Gold");
			 else if(entry.getValue()>=80 && entry.getValue()<90)
				 hm.put(entry.getKey(),"Silver");
			 else if(entry.getValue()>=70 &&entry.getValue()<80)
				 hm.put(entry.getKey(),"Bronze");
			 else
				 hm.put(entry.getKey(),"No medals");
		 }
		 return hm;
	}
}
public class Exercise4 {
public static void main(String[] args)
{
	Student st=new Student();
	HashMap<Integer,Integer> hmap=new LinkedHashMap<>();
	hmap.put(11609818,95);
	hmap.put(11609545,79);
	hmap.put(11604545,45);
	hmap.put(11651545,82);
	hmap.put(11667425,78);
	hmap.put(11154451,91);
	System.out.println(st.getStudents(hmap));
}
}
