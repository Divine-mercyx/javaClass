import numbers.Numbers;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Numbers numbers = new Numbers();
    public static void main(String[] args) {
         char[][] board = {
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
                 {'0', '0', '0', '0'},
         };

         String response = input("enter number: ");
         displayBoard(board, response);
    }

    private static void displayBoard(char[][] board, String response) {
        switch (response) {
            case "0110000":
                numbers.drawOne(board);
                display(board);
                break;

            case "1101101":
                numbers.drawTwo(board);
                display(board);
                break;
        }
    }

    public static void display(char[][] board) {
        String response = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '0') {
                    response += "\t";
                }
                else {
                    response += board[i][j] + "\t";
                }
            }
            response += "\n";
        }
        System.out.println(response);
    }


    private static String input(String prompt) {
        Scanner input = new Scanner(System.in);
        print(prompt);
        return input.nextLine();
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }
}