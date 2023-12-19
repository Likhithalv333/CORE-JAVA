
import java.util.Scanner;
class checkLogin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		
		if(username.length() == 10 || username.contains("@gmail.com"))
		{
			System.out.println("user entered valid details");
		}
		else{
			System.out.println("invalid login credentials");
		}
		sc.close();
		
	}
} 
