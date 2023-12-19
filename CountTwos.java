import java.util.Scanner;

public class CountTwos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int count = countTwosInRange(n);

        System.out.println("The number of 2's between 1 and " + n + " is: " + count);

        scanner.close();
    }

    public static int countTwosInRange(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countTwosInNumber(i);
        }
        return count;
    }

    public static int countTwosInNumber(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 2) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
