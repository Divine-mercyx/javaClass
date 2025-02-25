package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testToDrawOne() {
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        Numbers numbers = new Numbers();
        char[][] expected = numbers.drawOne(board);
        char[][] actual = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '0'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToDrawTwo() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawTwo(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'#', '#', '#', '#'},
                {'#', '0', '0', '0'},
                {'#', '0', '0', '0'},
                {'#', '0', '0', '0'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToDrawThree() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };

        char[][] expected = numbers.drawThree(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testToDrawFour() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawFour(board);
        char[][] actual = {
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'}
        };
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testToDrawFive() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawFive(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'#', '0', '0', '0'},
                {'#', '0', '0', '0'},
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToDrawSix() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawSix(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'#', '0', '0', '0'},
                {'#', '0', '0', '0'},
                {'#', '#', '#', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testToDrawSeven() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawSeven(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'}
        };
        assertArrayEquals(expected, actual);
    }



    @Test
    public void testToDrawEight() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawEight(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '#', '#', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }



    @Test
    public void testToDrawNine() {
        Numbers numbers = new Numbers();
        char[][] board = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        char[][] expected = numbers.drawNine(board);
        char[][] actual = {
                {'#', '#', '#', '#'},
                {'#', '0', '0', '#'},
                {'#', '0', '0', '#'},
                {'#', '#', '#', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'0', '0', '0', '#'},
                {'#', '#', '#', '#'}
        };
        assertArrayEquals(expected, actual);
    }

}
