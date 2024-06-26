import java.util.Scanner;

//As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses a game and rage quits.
// His gaming setup consists of a headset, mouse, keyboard, and display.
// You will receive Peter's lost games count.
//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.
//You will receive the price of each item in his gaming setup.
// Calculate his rage expenses for renewing his gaming equipment.

//Input / Constraints
//•	On the first input line - lost games count – integer in the range [0, 1000].
//•	On the second line – headset price - the floating-point number in the range [0, 1000].
//•	On the third line – mouse price - the floating-point number in the range [0, 1000].
//•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
//•	On the fifth line – display price - the floating-point number in the range [0, 1000].

//Output
//•	As output you must print Peter's total expenses: "Rage expenses: {expenses} lv."

//Example

//Input:
//7
//2
//3
//4
//5

//Output:
//Rage expenses: 16.00 lv.

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countLoseGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        for (int game = 1; game <= countLoseGames; game++) {
            if (game % 2 == 0) {
                headsetCount++;
            }
            if (game % 3 == 0) {
                mouseCount++;
            }
            if (game % 6 == 0) {
                keyboardCount++;
            }
            if (game % 12 == 0) {
                displayCount++;
            }
        }

        double totalPrice = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
