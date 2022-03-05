import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    }
}
