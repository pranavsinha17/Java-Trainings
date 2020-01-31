package Lab5;

import java.util.Scanner;
class UserDefineException extends Exception {
	
	private int age;
	UserDefineException(int age)
	{
	   this.age=age;	
	}
	
    public String toString()      {
       return "UserDefineException["+"User age is below 15 years"+"]";
    }

}
class AgeClass {
	private int age;
	AgeClass(int Age)
	{
		age=Age;
	}
	public  void employeeAge() throws UserDefineException
	{
		if(age<15)
			throw new UserDefineException(age);
		System.out.println("Your age is "+age+ " your are eligible for this event");
	}
}
public class Exercise5 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		try {
			
			AgeClass ac=new AgeClass(Age);
			ac.employeeAge();
		} catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
