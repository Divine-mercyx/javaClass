import java.util.Scanner;

public class TicTacToe2 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        String[] tictactoe = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        
        displayBoard(tictactoe);
        
        
        
    }
    
    public static void displayBoard(String[] board) {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |\n" + "-------------\n" + "| " + board[3] + " | " + board[4] + " | " + board[5] + " |\n" + "-------------\n" + "| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }
}
