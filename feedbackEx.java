import java.util.Scanner;
class feedbackEx
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System .out.println("enter grade(A,B,C,D)");
		char grade = s.next().charAt(0);
		String feedback = null;
		switch(grade)
		{
		
			case 'A':feedback  = "excellent job!!";
					break;
			case 'B':feedback = "good job";
					break;
			
			case 'C':feedback = "you can dobetter";
					break;
			case 'D' :feedback = "need improvement";
					break;
			default   : 
					break;
				
		}
		System.out.println(" feedback:"+feedback);
			s.close();
	}
}
