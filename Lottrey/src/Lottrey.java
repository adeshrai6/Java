import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottrey {
    public static void main(String[] args) {
        List<Integer> winningNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            while(true){
                int winningNumber = random.nextInt(49) + 1;
                if(!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }

        }
        System.out.println(winningNumbers);

        Scanner scanner = new Scanner(System.in);
        List<Integer> pickedNumber = new ArrayList<>();
        System.out.print("Please enter your number:");

        for (int i = 0; i < 6; i++) {
            while (true) {
                String stringNumber = scanner.nextLine();
                int pick = Integer.parseInt(stringNumber);

                if (pick > 0 && pick < 50) {
                    pickedNumber.add(pick);
                    break;
                }
            }
        }


    }
}
