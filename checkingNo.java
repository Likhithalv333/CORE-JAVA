import java.util.Scanner;
class checkingNo
{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st no");
	int n1 = sc.nextInt();
	System.out.println("enter 2st no");
	int n2 = sc.nextInt();
	if(n1 > n2){
		System.out.println("n1 is grater..."+n1);
	}
	else if(n1 < n2){
		System.out.println("n2 is grater...."+n2);
	}
	else{
		System.out.println("both nos are same"+n2+" "
			+n1);
	}
}
}