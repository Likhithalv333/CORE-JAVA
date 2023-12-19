import java.util.Scanner;
class daysCheck
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a day");
		String day = s.next();
		switch(day)
		{
		
			case "monday":System.out.println(" monday is bad day");
							break;
			
			case "friday":System.out.println(" friday is a good day");
							break;
			
			case "saturday":
			case "sunday"  :System.out.println(" party days!!enjoyeeee pandagoww");
							break;
			default     : System.out.println(" mid days are ok ok");
							break;
				
		}
			s.close();
	}
}
