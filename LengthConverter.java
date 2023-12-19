import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter length in centimeters: ");
        int centimeters = scanner.nextInt();

        // Convert to meters, feet, inches, and centimeters
        int meters = centimeters / 100;
		int remainingCms = centimeters % 100;
		int feet = remainingCms / 30;
		int remainingcentimeter = remainingCms  % 30;
        double inches =remainingcentimeter / 2.5;
		double cms =  remainingcentimeter % 2.5;
        System.out.println("meters"+meters);
	   System.out.println("feet"+feet);
	   System.out.println("inchs"+inches);
	   System.out.println("cms"+cms);
    }
}
