
import java.lang.Math;
public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int number = 12345; // Replace with the number you want to modify
		int temp=number;
		int digit;
        int c=0;
		while(temp!=0){
			digit=temp%10;
			c++;
			temp=temp/10;
		}

        System.out.println("count= "+c);
		// Extract the first and last digits
        int firstDigit = number / (int) Math.pow(10, c - 1);
        int lastDigit = number % 10;

        System.out.println("firstDigt= "+firstDigit);
		System.out.println("lastDigit= "+lastDigit);
		// Remove the first and last digits from the number
         number = number % (int) Math.pow(10, c-1);
         number = number / 10;

        // Calculate the swapped number
        int swappedNumber = lastDigit * (int) Math.pow(10, c-1) + number* 10 + firstDigit;

        System.out.println("swappedNumber= "+swappedNumber);
    }
}
