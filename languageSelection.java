import java.util.Scanner;
class languageSelection
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("select language 1.telugu,2.english ,3.hindi,4.kannada,5.tamil ");
		int option = s.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("u are selected telugu");
				System.out.println("conversation in telugu");
				break;
			case 2:
				System.out.println("u are selected english");
				System.out.println("conversation in english");
				break;
			case 3:
				System.out.println("u are selected hindi");
				System.out.println("conversation in hindi");
				break;
			case 4:
				System.out.println("u are selected kannada");
				System.out.println("conversation in kannada");
				break;
			case 5:
				System.out.println("u are selected tamil");
				System.out.println("conversation in tamil");
				break;
			default :
				System.out.println("invalid option");
				break;
		}
			s.close();
	}
}
