import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidMove = false;
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printBoard(board);
        playerTurn(board, scanner);

        Random random = new Random();

        while (true) {
            int computerPlay = random.nextInt(9) + 1;
            if(isValidMove){

            }
        }

    }

    private static boolean isSpaceAvailable(char[][] board, int position){
        switch (position){
            case 1: return (board[0][0] == ' ');
            case 2: return (board[0][1] == ' ');
            case 3: return (board[0][2] == ' ');
            case 4: return (board[1][0] == ' ');
            case 5: return (board[1][1] == ' ');
            case 6: return (board[1][2] == ' ');
            case 7: return (board[2][0] == ' ');
            case 8: return (board[2][1] == ' ');
            case 9: return (board[2][2] == ' ');
            default:
                System.out.println("Not valid move");
                return false;
        }
    }
    private static void playerTurn(char[][] board, Scanner scanner) {

        scanner = new Scanner(System.in);
        System.out.print("Please enter '1-9' in the board:");
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                board[0][0] = 'x';
                break;
            case "2":
                board[0][1] = 'x';
                break;
            case "3":
                board[0][2] = 'x';
                break;
            case "4":
                board[1][0] = 'x';
                break;
            case "5":
                board[1][1] = 'x';
                break;
            case "6":
                board[1][2] = 'x';
                break;
            case "7":
                board[2][0] = 'x';
                break;
            case "8":
                board[2][1] = 'x';
                break;
            case "9":
                board[9][0] = 'x';
                break;
            default:
                System.out.println("you input wrong thing");
        }

        printBoard(board);

    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("–+–+–");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("–+–+–");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }
}
