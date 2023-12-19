import java.lang.Math;
class amstrong 
{
	public static void main(String[] args) 
	{
		int num=153;
		int value=num;
		int temp=num;
		int smp=0;
		int digit;
		int c=0;
		while(temp!=0)
		{
			digit=temp%10;
			c++;
			temp=temp/10;
		}
		System.out.println(c);
		while(value!=0){
			digit=value%10;
			smp=smp+(int)Math.pow(digit,c);
			value=value/10;

		}
		System.out.println(smp);
		if(smp==num){
			System.out.println("amstrong");
		}
		else{
			System.out.println("not");
		}
	}
}
