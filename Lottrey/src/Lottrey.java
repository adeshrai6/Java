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
//        System.out.println(winningNumbers);

        Scanner scanner = new Scanner(System.in);
        List<Integer> pickedNumber = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Your numbers are " + pickedNumber);
            while (true) {
                try {
                    System.out.print("Please enter number between(1–49), this is your " + (i + 1) + " number: ");
                    String stringNumber = scanner.nextLine();

                    int pick = Integer.parseInt(stringNumber);

                    if (pick > 0 && pick < 50) {
                        pickedNumber.add(pick);
                        break;
                    } else {
                        System.out.println(pick + " is not between 1–49");
                    }
                }catch (NumberFormatException e){
                    System.out.println("It's not number");
                }
            }
        }
        System.out.println("The winning numbers were: " + winningNumbers);
        System.out.println("Your numbers are: " + pickedNumber);

        pickedNumber.retainAll(winningNumbers);
        System.out.println("Your match numbers are " + pickedNumber);

        if(pickedNumber.containsAll(winningNumbers)){
            System.out.println("Holly carp! you won :)");
        }else {
            System.out.println("Sorry you didn't win, you matched " + pickedNumber.size() + " number.");
        }

    }
}
