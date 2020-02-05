package Case_Study_Stream_Api;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeRepository {
public static void main(String[] args )
{
	Employee emp1=new Employee();
	emp1.setEmployeeId(1);
	emp1.setFirstName("Pranav");
	emp1.setLastName("Sinha");
	emp1.setDesignation("SDE 2");
	emp1.setEmail("pranav.sinha17@gmail.com");
	emp1.setPhoneNumber("7976766408");
	emp1.setHireDate(LocalDate.of(2018,01,10));
	emp1.setSalary(1200000.00);
	emp1.setManagerId(2);
	Department dep=new Department("R&D",2,5);
	emp1.setDepartment(dep);
	
	Employee emp2=new Employee();
	emp2.setEmployeeId(2);
	emp2.setFirstName("Sarthak");
	emp2.setLastName("Dalabahera");
	emp2.setDesignation("SDE 1");
	emp2.setEmail("sarthak.acoustic@gmail.com");
	emp2.setPhoneNumber("7564258154");
	emp2.setHireDate(LocalDate.of(2015,04,01));
	emp2.setSalary(1500000.00);
	emp2.setManagerId(1);
	dep=new Department("Data Automation and AI",3,4);
	emp2.setDepartment(dep);
	
	Employee emp3=new Employee();
	emp3.setEmployeeId(1);
	emp3.setFirstName("Priya");
	emp3.setLastName("Ranjan");
	emp3.setDesignation("SDE 2");
	emp3.setEmail("mishrasubham00@gmail.com");
	emp3.setPhoneNumber("7542568482");
	emp3.setHireDate(LocalDate.of(2014,05,10));
	emp3.setSalary(1300000.00);
	emp3.setManagerId(2);
    dep=new Department("R&D",2,5);
	emp3.setDepartment(dep);
	
	
	ArrayList<Employee>empObjectArr=new ArrayList<>();
	empObjectArr.add(emp1);
	empObjectArr.add(emp2);
	empObjectArr.add(emp3);
	EmployeeService emps=new EmployeeService();
	System.out.println(emps.getAllEmployeeSum(empObjectArr));
	System.out.println(emps.getDepartmentWiseList(empObjectArr));
	System.out.println(emps.getSeniorEmployeeOfOrg("R&D",empObjectArr));
	System.out.println(emps.getEmployeeListWithDuration(empObjectArr));
	System.out.println(emps.empWithNoDep(empObjectArr));
}
}
