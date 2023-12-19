
import java.util.Scanner;
class loginCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		System.out.println("enter password");
		String password = sc.next();
		if(username.equals("likhitha") && password.equals("likhitha123"))
		{
			System.out.println("user entered valid details");
		}
		else{
			System.out.println("invalid login credentials");
		}
		sc.close();
		
	}
}
