
class conversion
{
	public static void main(String[] args) 
	{
		int n=8796;
		int meter = n / 100;
		int remainingcms = (int)n %100;
		int feet = (int)remainingcms/30;
		int inch = (int)(n/2.5);
		int wholeFeet = (int) (feet);
		int remainingInches = (feet-wholeFeet)*12;
		
		System.out.println(meter+"meter"+feet+"feet"+remainingInches+"inch"+remainingcms+"cm");
		
	}
}
