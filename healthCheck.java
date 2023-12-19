
import java.util.Scanner;
class healthCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("are u feeling fever");
		boolean isFever = sc.nextBoolean();
		System.out.println("are u feeling cold");
		boolean isCold = sc.nextBoolean();
		
		
		if(isFever || isCold)
		{
			System.out.println("take rest until recovery");
		}
		else{
			System.out.println("please attend classes regularly");
		}
		sc.close();
		
	}
} 
