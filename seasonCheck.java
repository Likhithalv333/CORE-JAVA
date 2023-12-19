import java.util.Scanner;
class seasonCheck
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter your month number");
		int month = s.nextInt();
		switch(month)
		{
			case 3:
			case 4:
			case 5:
			case 6:System.out.println(" you are in summer season");
					break;
			case 7:
			case 8:
			case 9:
			case 10:System.out.println(" you are rainy season");
					break;
			case 11:
			case 12:
			case 1:
			case 2:System.out.println(" you are in winter season");
					break;
				
		}
			s.close();
	}
}
