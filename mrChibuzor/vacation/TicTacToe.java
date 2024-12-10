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
            } else {
                Value status = Value.O;
                playerPlayed(status);
                displayBoard();
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
    
    public static void checkIfWon() {
    
    }
}
