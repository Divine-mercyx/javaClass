import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {



    static enum Value {X, O, EMPTY}
    static private Value[][] board = new Value[3][3];
    
    public TicTacToe() {
        Value status = Value.EMPTY;
        for (int index = 0; index < board.length; index++) {
            for (int column = 0; column < board[index].length; column++) {
                board[index][column] = status;
            }
        }
    }
    
    public static void main(String... args) {
        TicTacToe person = new TicTacToe();
        displayBoard();
        playerMoves();
    }
    
    public static void displayBoard() {
        for (int index = 0; index < board.length; index++) {
            for (int column = 0; column < board[index].length; column++) {
                System.out.print(board[index][column] + " ");
            }
            System.out.println();
        }
    }
    
    public static void playerMoves() {
        int count = 1;
        while (count <= 9) {
            if (count % 2 == 0) {
                Value status = Value.X;
                playerPlayed(status);
                displayBoard();
                if (checkIfWon(status)) {
                    System.out.println("player " + status + " is the winner");
                    break;
                }
            } else {
                Value status = Value.O;
                playerPlayed(status);
                displayBoard();
                 if (checkIfWon(status)) {
                    System.out.println("player " + status + " is the winner");
                    break;
                }
            }
            count++;
        }
    }
    
    
    public static void playerPlayed(Value status) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("player " + status + ": play in (1 - 9): ");
            choice = input.nextInt();
            if (choice <= 0 || choice > 9) {
                System.out.println("invalid, try again.");
            }
        } while (choice <= 0 || choice > 9);
        addToBoard(status, choice);
    }
    
    public static void addToBoard(Value status, int number) {
        int row = (number - 1) / 3;
        int column = (number - 1) % 3;
        if (board[row][column] == Value.EMPTY) {
            board[row][column] = status;
        } else {
            System.out.println("position already filled");
            playerPlayed(status);
        }
    }
    
    public static boolean checkIfWon(Value status) {
        boolean value = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == status && board[row][1] == status && board[row][2] == status ||
                board[0][row] == status && board[1][row] == status && board[2][row] == status ||
                board[0][2] == status && board[1][1] == status && board[2][0] == status||
                board[0][0] == status && board[1][1] == status && board[2][2] == status) {
                value = true;
            }
        }          
      return value;
    }
}
