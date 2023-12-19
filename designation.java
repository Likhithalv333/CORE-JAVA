import java.util.Scanner;
class designation
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("select language manager,teamlead,developer,HR ");
		String desig = s.next();
		switch(desig)
		{
			case "manager":
				System.out.println("he manages the work");
				break;
			case "teamlead":
				System.out.println("he is the god of the team");
				break;
			case "developer":
				System.out.println("he is in learning stage");
				break;
			case "hr":
				System.out.println("hire the people");
				break;
			default :
				System.out.println("invalid desig");
				break;
		}
			s.close();
	}
}
