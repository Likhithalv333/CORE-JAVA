class strong 
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int digit;
		int sum=0;
		int fact=1;
		while(temp!=0){
			digit=temp%10;
			for(int i=1;i<=digit;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
			System.out.println(fact);
			System.out.println(sum);
			System.out.println(temp);
		}
		

		
		
	}
}
