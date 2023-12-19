import java.util.Scanner;
class weatherCheck
{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("is it rainy");
	boolean isRainy = sc.nextBoolean();
	System.out.println("is it windy");
	boolean isWindy = sc.nextBoolean();
	if(isRainy || isWindy){
		System.out.println(" weather is not ideal choice is your's");
	}
	else if(isRainy && isWindy){
		System.out.println("Alert:cyclone on going");
	}
	else{
		System.out.println("weather is cool you can go outside");
	}
}
}