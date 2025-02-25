package numbers;

import java.util.Arrays;

public class Numbers {



    public char[][] drawOne(char[][] board) {
        int length = board[0].length;
        fillEndWithHash(board, length);
        return board;
    }

    public char[][] drawTwo(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][length - 1] = '#';
        board[2][length - 1] = '#';
        Arrays.fill(board[3], '#');
        board[4][0] = '#';
        board[5][0] = '#';
        board[6][0] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }

    public char[][] drawThree(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][length - 1] = '#';
        board[2][length - 1] = '#';
        Arrays.fill(board[3], '#');
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }



    private void fillEndWithHash(char[][] board, int length) {
        board[1][length - 1] = '#';
        board[2][length - 1] = '#';
        board[3][length - 1] = '#';
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
    }

    public char[][] drawFour(char[][] board) {
        int length = board[0].length;
        board[0][length - 1] = '#';
        fillEndWithHash(board, length);
        Arrays.fill(board[3], '#');
        board[0][0] = '#';
        board[1][0] = '#';
        board[2][0] = '#';
        board[7][length - 1] = '#';
        return board;
    }

    public char[][] drawFive(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][0] = '#';
        board[2][0] = '#';
        Arrays.fill(board[3], '#');
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }

    public char[][] drawSix(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][0] = '#';
        board[2][0] = '#';
        Arrays.fill(board[3], '#');
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
        board[4][0] = '#';
        board[5][0] = '#';
        board[6][0] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }

    public char[][] drawSeven(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        fillEndWithHash(board, length);
        board[7][length - 1] = '#';
        return board;
    }

    public char[][] drawEight(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][0] = '#';
        board[2][0] = '#';
        board[1][length - 1] = '#';
        board[2][length - 1] = '#';
        Arrays.fill(board[3], '#');
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
        board[4][0] = '#';
        board[5][0] = '#';
        board[6][0] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }

    public char[][] drawNine(char[][] board) {
        int length = board[0].length;
        Arrays.fill(board[0], '#');
        board[1][0] = '#';
        board[2][0] = '#';
        board[1][length - 1] = '#';
        board[2][length - 1] = '#';
        Arrays.fill(board[3], '#');
        board[4][length - 1] = '#';
        board[5][length - 1] = '#';
        board[6][length - 1] = '#';
        Arrays.fill(board[7], '#');
        return board;
    }
}