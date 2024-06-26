import java.util.Arrays;
import java.util.Scanner;

//Write a program that calculates the difference between the sum of the even
// and the sum of the odd numbers in an array.

//Example

//Input:
//1 2 3 4 5

//Output:
//3

public class EvenOddSubtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }

        }

        System.out.println(even - odd);
    }
}
