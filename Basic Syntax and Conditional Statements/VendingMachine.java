import java.util.Scanner;
//Your task is to calculate the total purchase price from a vending machine.
// Until you receive "Start" you will be given different coins that are being inserted into the machine.
// You have to sum them to have the total money inserted. There is a problem though.
// Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
// If someone tries to insert some other coins, you have to display "Cannot accept {money}",
// where the value is formatted to the second digit after the decimal point and not add it to the total money.
// On the next few lines until you receive "End" you will be given products to purchase.
// Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke".
// The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
// If the person tries to purchase a not existing product, print "Invalid product".
// Be careful that the person may try to purchase a product for which he doesn't have money.
// In that case, print "Sorry, not enough money". If the person purchases a product successfully
//print "Purchased {product name}".
// After the "End" command, print the money that is left formatted to the second decimal point
// in the format "Change: {money left}".

//Example

//Input:
//Input
//1
//1
//0.5
//0.6
//Start
//Coke
//Soda
//Crisps
//End

//Output:
//Cannot accept 0.60
//Purchased Coke
//Purchased Soda
//Sorry, not enough money
//Change: 0.70

public class VendingMachine {

    public class VendingMachine_07 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double sumCoins = 0;

            String input = scanner.nextLine();
            while (!input.equals("Start")) {

                double coin = Double.parseDouble(input);

                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                    sumCoins += coin;
                } else {
                    System.out.printf("Cannot accept %.2f\n", coin);
                }

                input = scanner.nextLine();
            }

            String product = scanner.nextLine();
            while (!product.equals("End")) {

                switch (product) {
                    case "Nuts":
                        if (sumCoins >= 2.00) {
                            System.out.println("Purchased " + product);
                            sumCoins -= 2.00;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Water":
                        if (sumCoins >= 0.70) {
                            System.out.println("Purchased " + product);
                            sumCoins -= 0.70;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Crisps":
                        if (sumCoins >= 1.50) {
                            System.out.println("Purchased " + product);
                            sumCoins -= 1.50;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Soda":
                        if (sumCoins >= 0.80) {
                            System.out.println("Purchased " + product);
                            sumCoins -= 0.80;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    case "Coke":
                        if (sumCoins >= 1.00) {
                            System.out.println("Purchased " + product);
                            sumCoins -= 1.00;
                        } else {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    default:
                        System.out.println("Invalid product");
                        break;
                }
                product = scanner.nextLine();
            }

            System.out.printf("Change: %.2f", sumCoins);
        }
    }
}
