import java.util.Scanner;
class perfectrange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		for(int i=n1;i<=n2;i++){
			int sum=0;
			int temp=i;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum==temp){
				System.out.println(i);
			}
		}
	}
}
