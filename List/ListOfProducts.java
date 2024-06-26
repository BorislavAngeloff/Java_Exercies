import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Read a number n and n lines of products.
//Print a numbered list of all the products ordered by name

//Example

//Input:
//4
//Potatoes
//Tomatoes
//Onions
//Apples

//Output:
//1.Apples
//2.Onions
//3.Potatoes
//4.Tomatoes

public class ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countProducts = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int count = 1; count <= countProducts; count++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }

        //products = {"Potatoes", "Tomatoes", "Onions", "Apples"}

        Collections.sort(products);
        //products = {"Apples", "Onions", "Potatoes", "Tomato"}

        int number = 1;
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
