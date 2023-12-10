package pack1;

public class Employee 
{

	
	Employee(String empName,int empId)
	{
		System.out.println(empName);
		System.out.println(empId);
	}
	
	
	public static void main(String[] args) 
	{
		Employee emp1=new Employee("Lokesh",100);
		
		Employee emp2=new Employee("sreekar",101);
		

	}

}
