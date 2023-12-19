import java.util.Scanner;
class largeno 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int large=0;
		for (int i=1;i<=10;i++ )
		{
			System.out.println("enter number");
			int num=sc.nextInt();
			if(num<large){
				large=num;
				System.out.println(large);
			}
		}
		System.out.println("out of give numbers the small number is"+large);
	}
}
