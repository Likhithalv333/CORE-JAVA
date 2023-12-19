import java.util.Scanner;
class adam 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		int digit,rev=0,rev1=0,temp=num;
		int sq=num*num;
		System.out.println("sq of given number"+sq);
		while(num!=0){
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("rev of given number"+rev);
		int revsq=rev*rev;
		System.out.println("sq of rev number"+revsq);
		while(revsq!=0){
			digit=revsq%10;
			rev1=rev1*10+digit;
			revsq=revsq/10;
		}
		System.out.println("rev of sq of revs number"+rev1);
		if(rev1==sq){
		System.out.println("adam "+temp);
		}
		else{
			System.out.println("not adam number "+temp);
		}

	}
}
