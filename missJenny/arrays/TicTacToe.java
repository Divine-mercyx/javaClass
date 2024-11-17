import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static void main(String... args) {
      Scanner input = new Scanner(System.in);
      Random myrand = new Random();
      int count = 1;
      boolean gameIsWon = false;
      String playerX  = "X";
      int row1 = 0;
      int column1 = 0;
      int row2 = 0;
      int column2 = 0;
      String playerO = "O";
      String[][] ticTacToe = {
      {" ", " ", " "},
      {" ", " ", " "},
      {" ", " ", " "}
      };
      

      while (count <= 9 && !gameIsWon) {
      
      
          do {
              /*row1 = myrand.nextInt(2);
              System.out.print("enter a row (0, 1 or 2) player x: " + row1);
              column1 = myrand.nextInt(2);
              System.out.print("enter a column (0, 1 or 2) player x: " + column1);*/
              
              System.out.print("enter a row (0, 1 or 2) player X: ");
              row1 = input.nextInt();
              System.out.print("enter a column (0, 1 or 2) player X: ");
              column1 = input.nextInt();

              if (ticTacToe[row1][column1] != " ") {
                  System.out.println("position already filled");
              } 
            } while(ticTacToe[row1][column1] != " ");
            
            
                  ticTacToe[row1][column1] = "X";
                  System.out.print("\033[H\033[2J"); 
                  System.out.flush();
                  displayBoard(ticTacToe);
                  
                  if (checkIfWon(ticTacToe, playerX)) {
                      System.out.println("player X won");
                      gameIsWon = true;
                      break;
                  } else if (isFull(ticTacToe)) {
                      System.out.println("draw");
                      break;
                  } 
            
            
            
            
          
      do {
              System.out.print("enter a row (0, 1 or 2) player O: ");
              row2 = input.nextInt();
              System.out.print("enter a column (0, 1 or 2) player O: ");
              column2 = input.nextInt();
              
              
              if (ticTacToe[row2][column2] != " ") {
                  System.out.println("position already filled");
              }
          } while(ticTacToe[row2][column2] != " ");
          
                    
              ticTacToe[row2][column2] = "O";
              System.out.print("\033[H\033[2J"); 
              System.out.flush();
              displayBoard(ticTacToe);
              
              if (checkIfWon(ticTacToe, playerO)) {
                  System.out.println("player O won");
                  gameIsWon = true;
                  break;
              } else if (isFull(ticTacToe)) {
                  System.out.println("draw");
                  break;
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
    
    /*public static boolean getStatusOfIndex(int row, int column) {
        boolean status = false;
        if (row > 2 || column > 2) {
            status = true;
        }
        return status;
    }*/
    
    
    
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
