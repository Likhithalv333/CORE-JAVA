import java.util.Scanner;
class noChecking
{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int n = sc.nextInt();
	if(n > 0){
		System.out.println("given no is positive:"+n);
	}
	else if(n < 0){
		System.out.println("given no is negative:"+n);
	}
	else{
		System.out.println("given no is zero:"+n);
	}

	
}
}