import java.util.Scanner;
class studentavg
{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter student id...");
	int studentId = s.nextInt();
	System.out.println("enter student name...");
	String studentName = s.next();
	System.out.println("enter science marks...");
	int science = s.nextInt();
	System.out.println("enter social marks...");
	int social = s.nextInt();
	System.out.println("enter math marks...");
	int maths = s.nextInt();
	int total;
	total = science+social+maths;
	int avg;
	avg = total/3;

	if( avg > 50){
		System.out.println("student name..."+studentName);
		System.out.println("student roll no..."+studentId);
		System.out.println("total marks..."+total);
		System.out.println("congratulations! you paseed with an average score of"+avg);
	}
	else{
		System.out.println("student name..."+studentName);
		System.out.println("student roll no..."+studentId);
		System.out.println("total marks..."+total);
		System.out.println("sorry! you are not paseed with an average score of"+avg);
	}


	
}
}