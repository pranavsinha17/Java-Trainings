package Case_Study_Stream_Api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class EmployeeService  {
   
public Double getAllEmployeeSum(ArrayList<Employee> emp)
{
	 List<Double> arList=new ArrayList<>();
	for(Employee i : emp)
	arList.add(i.getSalary());
	Double sum = arList.stream().reduce((double) 0,(ans,i)-> ans+i);
	return sum;
}

public HashMap<String,Integer>getDepartmentWiseList(ArrayList<Employee> emp) {
	HashMap<String,Integer> hmap=new HashMap<>();
	for(Employee i:emp)
	{
	Integer val=hmap.get(i.getDepartment().getDepartName());
	if(val!=null)
		hmap.put(i.getDepartment().getDepartName(),val+1);
	else
		hmap.put(i.getDepartment().getDepartName(),1);
	}
	return hmap;
}
public String  getSeniorEmployeeOfOrg(String departmentName,ArrayList<Employee> emp)
{
	HashMap<String,Long> hmap=new HashMap<>();
	for(Employee i : emp)
	{
	if(i.getDepartment().getDepartName().equals(departmentName))
	{
		long p2 = ChronoUnit.DAYS.between(i.getHireDate(),  LocalDate.now());

		hmap.put(i.getFirstName()+" "+i.getLastName(),p2);
	}
	}
	Long days=(long) 0;
	for (Entry<String, Long> entry : hmap.entrySet())
	{
		if(days<entry.getValue())
			days=entry.getValue();
	}
	for (Entry<String, Long> entry : hmap.entrySet()) {
		if(entry.getValue()==days)
        return entry.getKey();
	}
	return "No Senior Employee";
}

public HashMap<String,HashMap<Long,Long>>getEmployeeListWithDuration(ArrayList<Employee> emp) {
	HashMap<String,HashMap<Long,Long>> hmap=new HashMap<>();
	for(Employee i: emp)
	{
		long days = ChronoUnit.DAYS.between(i.getHireDate(),  LocalDate.now());
		long months = ChronoUnit.MONTHS.between(i.getHireDate(),  LocalDate.now());
        HashMap<Long,Long> mp=new HashMap<>();
        mp.put(days,months);
		hmap.put(i.getFirstName()+" "+i.getLastName(), mp);
	}
	return hmap;
	
}

public String empWithNoDep(ArrayList<Employee> emp)
{
	for(Employee i: emp)
	{
		if(i.getDepartment()==null)
			return i.getFirstName()+" "+i.getLastName();
	}
	return "No such Employee";
}
}
