import java.util.Scanner;
class empsal
{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter emp id...");
	int empId = s.nextInt();
	System.out.println("enter emp name...");
	String empName = s.next();
	System.out.println("enter emp salary...");
	double empSalary = s.nextDouble();
	

	if( empSalary > 10000){
		System.out.println("he is a high paid employee");
		System.out.println("emp name..."+empName);
		System.out.println("emp id..."+empId);
		System.out.println("emp salary..."+empSalary);
		
	}
	else{
		System.out.println("he is a low paid employee");
		System.out.println("emp name..."+empName);
		System.out.println("emp id..."+empId);
		System.out.println("emp salary..."+empSalary);
	}


	
}
}