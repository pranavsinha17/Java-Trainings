package Case_Study_Stream_Api;

import java.time.LocalDate;

public class Employee {
private Integer employeeId;
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private LocalDate hireDate;
private String designation;
private Double salary;
private Integer managerId;
private Department department;
public void setEmployeeId(Integer employeeId)
{
	this.employeeId=employeeId;
}
public void setFirstName(String firstName)
{
	this.firstName=firstName;
}
public void setLastName(String lastName)
{
	this.lastName=lastName;
}
public void setEmail(String email)
{
	this.email=email;
}
public void setPhoneNumber(String phoneNumber)
{
	this.phoneNumber=phoneNumber;
}
public void setHireDate(LocalDate hireDate)
{
	this.hireDate=hireDate;
}
public void setDesignation(String designation)
{
	this.designation=designation;
}
public void setSalary(Double salary)
{
	this.salary=salary;
}
public void setManagerId(Integer managerId)
{
	this.managerId=managerId;
}
public void setDepartment(Department department)
{
	this.department=department;
}

public Integer getEmployeeId()
{
	return employeeId;
}
public String getFirstName()
{
return firstName;	
}
public String getLastName()
{
	return lastName;
}
public String getEmail()
{
	return email;
}
public String getPhoneNumber()
{
	return phoneNumber;
}
public LocalDate getHireDate()
{
	return hireDate;
}
public String getDesignation()
{
	return designation;
}
public Double getSalary()
{
	return salary;
}
public Integer getManagerId()
{
	return managerId;
}
public Department getDepartment()
{
	return department;
}

}
