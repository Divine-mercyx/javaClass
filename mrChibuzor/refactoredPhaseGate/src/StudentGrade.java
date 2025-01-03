import java.util.Scanner;

public class StudentGrade {


    public static void main(String[] args) {
        StudentGrade studentsGrade = new StudentGrade();
        int[][] students = new int[3][3];
        studentsGrade.collectScoresForEachStudent(students);
        studentsGrade.displayTable(students);
    }


    public void collectScoresForEachStudent(int[][] studentGrades) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < studentGrades.length; row++) {
            giveSpace();
            System.out.println("Entering score for student " + (row + 1));
            for (int col = 0; col < studentGrades[row].length; col++) {
                System.out.print("enter score for subject " + (col + 1) + ": ");
                int score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    addScore(row, col, score, studentGrades);
                }
                else {
                    col--;
                    System.out.println("invalid score, try again");
                }
            }
            clearSpace();
        }
    }


    public void displayTable(int[][] studentGrades) {
        printHeader(studentGrades);
        for (int row = 0; row < studentGrades.length; row++) {
            System.out.print("Student " + (row + 1) + ":\t");
            for (int col = 0; col < studentGrades[row].length; col++) {
                System.out.print(studentGrades[row][col] + "\t\t");
            }
            int total = getTotalScore(row, studentGrades);
            double average = getAverage(total, studentGrades);
            int position = getPosition(row, studentGrades);
            System.out.printf("%d\t\t%.1f\t\t%d\n", total, average, position);
        }
    }


    private void printHeader(int[][] studentGrades) {
        System.out.print("Students\t");
        for (int row = 0; row < studentGrades[0].length; row++) {
            System.out.print("sub " + (row + 1) + "\t");
        }
        System.out.println();
    }


    private int getPosition(int row, int[][] studentGrades) {
        int total = getTotalScore(row, studentGrades);
        int position = 1;
        for (int index = 0; index < studentGrades.length; index++) {
            int otherStudent = getTotalScore(index, studentGrades);
            if (index != row && total < otherStudent) {
                position++;
            }
        }
        return position;
    }


    private int getTotalScore(int row, int[][] studentGrades) {
        int totalScore = 0;
        for (int col = 0; col < studentGrades[row].length; col++) {
            totalScore += studentGrades[row][col];
        }
        return totalScore;
    }


    private double getAverage(int total, int[][] studentGrades) {
        return (double) total / studentGrades.length;
    }


    private void clearSpace() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    private void addScore(int row, int col, int score, int[][] studentGrades) {
        studentGrades[row][col] = score;
    }


    private void giveSpace() {
        System.out.println();
    }
}
