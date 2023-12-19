import java.util.Scanner;
class isluckyno 
{
	static int lucky(int num){
		int sum=0;
		while(num!=0){
			int digit =num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int sumres=isluckyno.lucky(num);
		if(sumres<=9){
			System.out.println(sumres);
		}
		else{
			int sumres1=isluckyno.lucky(sumres);
			System.out.println(sumres1);
		}
	}
}
