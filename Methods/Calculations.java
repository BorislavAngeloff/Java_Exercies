import java.util.Scanner;

//Write a program that receives a string on the first line
// ("add", "multiply", "subtract", "divide") and on the next two lines
// receives two numbers. Create four methods (for each calculation)
// and invoke the right one depending on the command.
// The method should also print the result (it needs to be void)


//Example

//Input:
//subtract
//5
//4

//Output:
//divide
//8
//4

public class Calculations {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String operation = scanner.nextLine(); //"add", "multiply", "subtract", "divide"
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());

            executeOperation(operation, firstNumber, secondNumber);
        }

        private static void executeOperation(String operation, int firstNumber, int secondNumber) {
            switch (operation) {
                case "add":
                    sumAndPrint(firstNumber, secondNumber);
                    break;
                case "multiply":
                    multiplyAndPrint(firstNumber, secondNumber);
                    break;
                case "subtract":
                    subtractAndPrint(firstNumber, secondNumber);
                    break;
                case "divide":
                    divideAndPrint(firstNumber, secondNumber);
                    break;

            }
        }

        public static void sumAndPrint(int n1, int n2) {
            System.out.println(n1 + n2);
        }

        public static void multiplyAndPrint(int n1, int n2) {
            System.out.println(n1 * n2);
        }

        public static void subtractAndPrint(int n1, int n2) {
            int diff = n1 - n2;
            System.out.println(diff);
        }

        public static void divideAndPrint(int n1, int n2) {
            System.out.println(n1 / n2);
        }
    }

