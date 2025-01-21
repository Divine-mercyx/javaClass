package mrChibuzor.vacation;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    static String[] value = {"+", "-", "*"};
    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static int score = 0;
    static int fail = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();

        int counter = 0;

        System.out.println("Welcome to the Quiz");

        while (counter < 10) {

            try {
                int index = rand.nextInt(value.length);
                int firstIndex = rand.nextInt(numbers.length - 1);
                int secondIndex = rand.nextInt(numbers.length - 1);
                int first = numbers[firstIndex];
                int second = numbers[secondIndex];

                displayInfo(index, first, second, counter);

            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                input.nextLine();
                counter--;
            }
            counter++;
        }
        System.out.println("You got: " + score);
        System.out.println("You failed " + fail);
    }


    public static  void displayInfo(int index, int first, int second, int counter) {
        if (value[index].contains("+")) {
            System.out.println("question " + (counter + 1) + " " + first + " + " + second + "\n>>> ");
            double answer = input.nextDouble();
            if (answer == first + second) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("wrong the correct answer is: " + (first + second));
                fail++;
            }
        }


        if (value[index].contains("-")) {
            System.out.println("question " + (counter + 1) + " " + first + " - " + second + "\n>>> ");
            double answer = input.nextDouble();
            if (answer == first - second) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("wrong the correct answer is: " + (first - second));
                fail++;
            }
        }

        if (value[index].contains("*")) {
            System.out.println("question " + (counter + 1) + " " + first + " * " + second + "\n>>> ");
            double answer = input.nextDouble();
            if (answer == first * second) {
                System.out.println("You got it!");
                score++;
            } else {
                System.out.println("wrong the correct answer is: " + (first * second));
                fail++;
            }
        }
    }
}
