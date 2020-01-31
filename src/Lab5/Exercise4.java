package Lab5;
class UserDefineException extends Exception {
	
	
	 public String toString()      {
	       return "UserDefineException["+"First Name and Last Name Unfilled"+"]";
	    }

}
 class EmployeeClass {
	String FirstName;
	String LastName;
	EmployeeClass(String firstName,String lastName)
	{
		FirstName=firstName;
		LastName=lastName;
	}
	public  void employeeName() throws UserDefineException
	{
		if(FirstName.isEmpty() && LastName.isEmpty())
			throw new UserDefineException();
		System.out.println("Your name is "+FirstName+ " "+LastName );
	}

}
public class Exercise4 {
	public static void main(String ar[])
	{
		String firstName="";
		String lastName="";
		/*Scanner sc=new Scanner(System.in);
		firstName=sc.next();
		lastName=sc.next();*/
		EmployeeClass ec=new EmployeeClass(firstName,lastName);
	    try {
			ec.employeeName();
		} catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
