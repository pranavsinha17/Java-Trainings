package Lab5;
class UserDefineException extends Exception {
	private float sal;
	UserDefineException(float sal)
	{
	   this.sal=sal;	
	}
	
    public String toString()      {
       return "UserDefineException["+"Employee salary is below 3000 rupee"+"]";
    }
}

class Employee {
	String employeeName;
	float sal;
	Employee(String name,float sal) 
	{
		employeeName=name;
		this.sal=sal;
	}
	public void SalaryDetails() throws UserDefineException
	{
		System.out.println("employee details :\n"+"name :"+employeeName+"\n"+"salary :"+sal);
		if(sal<3000)
				throw new UserDefineException(sal);
	}

}
public class Exercise6 {
	public static void main(String ar[]) throws UserDefineException {
		Employee ec=new Employee("Pranav",2000f);
		Employee ec1=new Employee("sarthak",7000f);
		try {
			
			ec.SalaryDetails();
			
		} catch (UserDefineException e) {
			System.out.println("caught  "+e);
			ec1.SalaryDetails();
        }

}
}
