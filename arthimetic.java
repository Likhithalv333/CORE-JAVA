import java.util.Scanner;
class arthimetic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int n1=sc.nextInt();
		System.out.println("Enter number2");
		int n2=sc.nextInt();
		System.out.println("select ur option(add,sub,mul,div,modulodiv,exit)");
		System.out.println(" enter ur option");
		String option=sc.next();
		int result=0;
		switch(option)
		{
			case "addition":
							result = n1+n2;
							break;
			case "subtraction":
							result = n1-n2;
							break;
			case "multiplication":
							result = n1*n2;
							break;
			case "division":
							result = n1/n2;
							break;
			case "modulodivision":
							result = n1%n2;
							break;
			default:
							System.out.println("exit");
							break;
		}
		System.out.println(option+" of two no's "+ n1
			+"and"+ n2 +"is:"+result);
	}
}
