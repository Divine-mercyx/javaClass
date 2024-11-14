import java.util.Scanner;

public class TicTacToe {
    public static void main(String... args) {
      Scanner input = new Scanner(System.in);
      int count = 1;
      boolean gameIsWon = false;
      String playerX  = "X";
      String playerO = "O";
      String[][] ticTacToe = {
      {" ", " ", " "},
      {" ", " ", " "},
      {" ", " ", " "}
      };
      

      while (count <= 9 && !gameIsWon) {
 
          System.out.print("enter a row (0, 1 or 2) player x: ");
          int row1 = input.nextInt();
          System.out.print("enter a column (0, 1 or 2) player x: ");
          int column1 = input.nextInt();
          
          
          if (ticTacToe[row1][column1] == " ") {
              ticTacToe[row1][column1] = "X";
              System.out.print("\033[H\033[2J"); 
              System.out.flush();
              displayBoard(ticTacToe);
              if (checkIfWon(ticTacToe, playerX)) {
                  System.out.println("you have won");
                  gameIsWon = true;
                  break;
              } else if (isFull(ticTacToe)) {
                  System.out.println("draw");
                  break;
              } 

          } else {
              System.out.println("position already filled");
          }
          
          
          System.out.print("enter a row (0, 1 or 2) player O: ");
          int row2 = input.nextInt();
          System.out.print("enter a column (0, 1 or 2) player O: ");
          int column2 = input.nextInt();
          
          if (ticTacToe[row2][column2] == " ") {
              ticTacToe[row2][column2] = "O";
              System.out.print("\033[H\033[2J"); 
              System.out.flush();
              displayBoard(ticTacToe);
              if (checkIfWon(ticTacToe, playerO)) {
                  System.out.println("you have won");
                  gameIsWon = true;
                  break;
              } else if (isFull(ticTacToe)) {
                  System.out.println("draw");
                  break;
              } 


              
          } else {
              System.out.println("position already filled");
              return;
          }
          count++;
      }
    } 
    
    public static void displayBoard(String[][] board) {
        System.out.println("current board");
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
        }
        System.out.println("-------------");
    }
    
    
    public static boolean checkIfWon(String[][] board, String player) {
        boolean status = false; 
        for (int row = 0; row < 3; row++) {
            if (board[row][0].equalsIgnoreCase(player) && board[row][1].equalsIgnoreCase(player) && board[row][2].equalsIgnoreCase(player) || 
                board[0][row].equalsIgnoreCase(player) && board[1][row].equalsIgnoreCase(player) && board[2][row].equalsIgnoreCase(player) ||
                board[0][2].equalsIgnoreCase(player) && board[1][1].equalsIgnoreCase(player) && board[2][0].equalsIgnoreCase(player) ||
                board[0][0].equalsIgnoreCase(player) && board[1][1].equalsIgnoreCase(player) && board[2][2].equalsIgnoreCase(player)
            ) {
                status = true;
            }
        }
        return status;
    }
    
    public static boolean isFull(String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == " ") {
                    return false;
                }
            }
        }
        return true;
    }
}
