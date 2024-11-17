import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe2 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int index = 0;
        String playerO = "\033[36mO\033[0m";
        String playerX  = "\033[32mX\033[0m";
        boolean gameIsWon = false;
        int count = 0;
        String[] tictactoe = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

        displayBoard(tictactoe);
        
        while (count < 9 && !gameIsWon) {
            do {
                System.out.print("\033[32mPlayer X\033[0m: where do you want to play (1 - 9): ");
                index = input.nextInt();
                
                if (tictactoe[index - 1] != " ") System.out.println("position " + index + " already filled, try again");
                input.nextLine();
            } while (tictactoe[index - 1] != " ");
            
            tictactoe[index - 1] = "\033[32mX\033[0m";
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            displayBoard(tictactoe);
            
            if (checkIfWon(tictactoe, playerX)) {
                System.out.println("player " + playerX + " is the winner");
                gameIsWon = true;
                break;
            } else if (isFull(tictactoe)) {
                System.out.println("its a draw");
                break;
            }
            
            
            
            
            do {
                System.out.print("\033[36mPlayer O\033[0m: where do you want to play (1 - 9): ");
                index = input.nextInt();
                
                if (tictactoe[index - 1] != " ") System.out.println("position " + index + " already filled, try again");
                input.nextLine();
            } while (tictactoe[index - 1] != " ");
            
            tictactoe[index - 1] = "\033[36mO\033[0m";
            System.out.print("\033[H\033[2J");
            System.out.flush();
            displayBoard(tictactoe);
            
            if (checkIfWon(tictactoe, playerO)) {
                System.out.println("player " + playerO + " is the winner");
                gameIsWon = true;
                break;
            } else if (isFull(tictactoe)) {
                System.out.println("its a draw");
                break;
            }
            
            
            count++;
        }
        
    }
    
    
    public static boolean checkIfWon(String[] board, String player) {
        boolean status = false;
        if (board[0].equalsIgnoreCase(player) && board[1].equalsIgnoreCase(player) && board[2].equalsIgnoreCase(player) || 
            board[3].equalsIgnoreCase(player) && board[4].equalsIgnoreCase(player) && board[5].equalsIgnoreCase(player) || 
            board[6].equalsIgnoreCase(player) && board[7].equalsIgnoreCase(player) && board[8].equalsIgnoreCase(player) ||
            
            board[0].equalsIgnoreCase(player) && board[3].equalsIgnoreCase(player) && board[6].equalsIgnoreCase(player) || 
            board[1].equalsIgnoreCase(player) && board[4].equalsIgnoreCase(player) && board[7].equalsIgnoreCase(player) || 
            board[2].equalsIgnoreCase(player) && board[5].equalsIgnoreCase(player) && board[8].equalsIgnoreCase(player) ||
            
            board[0].equalsIgnoreCase(player) && board[4].equalsIgnoreCase(player) && board[8].equalsIgnoreCase(player) || 
            board[2].equalsIgnoreCase(player) && board[4].equalsIgnoreCase(player) && board[6].equalsIgnoreCase(player)
            ) {
                status = true;
            }
            
          return status;
    }

    
    
    public static void displayBoard(String[] board) {
        System.out.println("Current board");
        System.out.println("-------------");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |\n" + "-------------\n" + "| " + board[3] + " | " + board[4] + " | " + board[5] + " |\n" + "-------------\n" + "| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("-------------");
    }
    
    
    
    public static boolean isFull(String[] board) {
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            if (board[row] != " ") {
                count += 1;
            }
        }
        if (count == 9) {
            return true;
        }
        return false;
    }
}
