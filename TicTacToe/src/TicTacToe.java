import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printBoard(board);
        playerTurn(board, scanner);
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
