
import java.util.Scanner;
class bookingEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter booking status(online/offline)");
		String status = sc.next();
		
		
		if(status.equalsIgnoreCase("online"))
		{
			System.out.println("directly goto movie");
		}
		else if(status.equalsIgnoreCase("offile")){
			System.out.println("u need to go box office and take the tickets");
		}
		else{

				System.out.println("please enter valid input...");
		}
		sc.close();
		
	}
} 
