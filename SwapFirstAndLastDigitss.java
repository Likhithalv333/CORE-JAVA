

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int number = 12345; // Replace with the number you want to modify

        int swappedNumber = swapFirstAndLastDigits(number);
        System.out.println("Original Number: " + number);
        System.out.println("Swapped Number: " + swappedNumber);
    }

    public static int swapFirstAndLastDigits(int num) {
        if (num < 10) {
            // If the number has only one digit, no need to swap
            return num;
        }

        // Find the number of digits
        int numDigits = (int) Math.log10(num) + 1;

        // Extract the first and last digits
        int firstDigit = num / (int) Math.pow(10, numDigits - 1);
        int lastDigit = num % 10;

        // Remove the first and last digits from the number
        num = num % (int) Math.pow(10, numDigits - 1);
        num = num / 10;

        // Calculate the swapped number
        int swappedNumber = lastDigit * (int) Math.pow(10, numDigits - 1) + num * 10 + firstDigit;

        return swappedNumber;
    }
}
