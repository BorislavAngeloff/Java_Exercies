import java.util.Scanner;

//Read an integer n from the console.
// Find all top numbers in the range [1 … n] and print them.
// A top number holds the following properties:

//Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//Holds at least one odd digit, e.g. 232, 707, 87578.

public class TopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            boolean isValidSumDigits = isSumOfDigitsDivisibleByEight(number);
            boolean doesContainsOddDigit = doesNumberContainsOneOddDigit(number);

            if (isValidSumDigits && doesContainsOddDigit) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumOfDigitsDivisibleByEight(int number) {

        int sumOfDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number /= 10;
        }

        return sumOfDigits % 8 == 0;
    }

    public static boolean doesNumberContainsOneOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }

        return false;
    }
}
