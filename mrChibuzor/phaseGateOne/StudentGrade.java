import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentGrade studentGrade = new StudentGrade();
        
        System.out.print("enter how many students: ");
        int student_number = input.nextInt();
        System.out.print("enter how many subjects: ");
        int subject_number = input.nextInt();
        int[] numbers = studentGrade.getNumberOfStudentsAndSubjects(student_number, subject_number);
        int[][] students = studentGrade.collectScoresForEveryStudentAndSubject(numbers);
        int[][] results = studentGrade.askQuestionsForStudents(students, input);
        studentGrade.displaySummary(results);
        
        
        
    }

    public int[] getNumberOfStudentsAndSubjects(int numberOfStudents, int numberOfSubjects) {
        int[] numbers = {numberOfStudents, numberOfSubjects};
        return numbers;
    }
    
    public int[][] collectScoresForEveryStudentAndSubject(int[] numbers) {
        int student = numbers[0];
        int subject = numbers[1];
        int[][] students = new int[student][subject];
        return students;
    }
    
    public int[][] askQuestionsForStudents(int[][] numbers, Scanner input) {
        for (int row = 0; row < numbers.length; row++) {
            System.out.println();
            System.out.println("entering score for student " + (row + 1));
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print("entering score for subject " + (column + 1) + ": ");
                int answer = input.nextInt();
                if (answer >= 0 && answer <= 100) {
                    numbers[row][column] = answer;
                } else {
                    System.out.println("error, invalid input: number must be zero or above zero. Try again...");
                    column--;
                }
            }
        }
        return numbers;
    }
    
    
    public  void displaySummary(int[][] numbers) {
        
        int position = numbers.length;
        System.out.println("=============================================================================");
        displayHeader(numbers);
        System.out.println("=============================================================================");
        for (int row = 0; row < numbers.length; row++) {
            int total = 0;
            System.out.print("Student " + (row + 1) + "\t");
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + "\t");
                total += numbers[row][column];
            }
            int lengths = numbers[row].length;
            double average = total / lengths;
            System.out.println(total + "\t" + average + "\t  " + (position--));
        }
        System.out.println("=============================================================================");
        System.out.println("=============================================================================");
        subjectSummary(numbers);
    }
    
    public void displayHeader(int[][] numbers) {
        System.out.print("Students\t");
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print("sub " + (column + 1) + "\t");
            }
            System.out.println("TOT\tAVE\tPOS");
            break;
        }
    }
    
    public void subjectSummary(int[][] numbers) {
        System.out.println("Subject summary");
        for (int row = 0; row < numbers[0].length; row++) {
            decideForEachSubject(row, numbers);
        }
        hardestSubject(numbers);
    }
    
    public void decideForEachSubject(int row, int[][] numbers) {
        int largest = numbers[0][row];
        int largestIndex = 0;
        int smallest = 0;
        int smallestIndex = 0;
        int total = 0;
        for (int column = 0; column < numbers.length; column++) {
            if (numbers[column][row] >= largest) {
                largest = numbers[column][row];
                largestIndex = column;
            }
            else {
                smallest =  numbers[column][row];
                smallestIndex = column;
            }
            total += numbers[column][row];
        }
        System.out.println("Subject " + (row + 1));
        System.out.println("highest scoring is:   student " + (largestIndex + 1) + " scoring: " + largest);
        System.out.println("lowest scoring is:   student " + (smallestIndex + 1) + " scoring: " + smallest + "\nTotal score: " + total + "\nAverage score: " + (total / numbers.length));
        int[] passAndFail = numberOfPasses(row, numbers);
        System.out.println("Number of passes: " + passAndFail[0] + "\nNumber of fails: " + passAndFail[1]);
        System.out.println();
    }
    
    public int[] numberOfPasses(int row, int[][] numbers) {
        int pass = 0;
        int fail = 0;
        int subject = row;
        for (int column = 0; column < numbers.length; column++) {
            if (numbers[column][row] >= 50) {
                pass++;
            }
            else fail++;
        }
        int[] value = {pass, fail, subject};
        return value;
    }
    
    public void hardestSubject(int[][] numbers) {
        int[] passAndFail;
        int hardest = 0;
        int easiest = 0;
        for (int row = 0; row < numbers[0].length; row++) {
            passAndFail = numberOfPasses(row, numbers);
            if (passAndFail[1] >= numbers[0].length) {
                hardest = row;
            }
            else {
                easiest = row;
            }
        }
        int[] scores = numberOfPasses(hardest, numbers);
        int[] scoresTwo = numberOfPasses(easiest, numbers);
        System.out.println("the hardest subject is subject " + (hardest + 1) + " with " + scores[1] + " failures" + "\nthe easiest subject is subject " + (easiest + 1) + " with " + scoresTwo[1] + " failures");
        int[][] studentsGradesOverall = getBestgraduatingStudent(numbers);
        System.out.println("the overall highest score is scored by student " + (studentsGradesOverall[0][1] + 1) + " in subject " + (studentsGradesOverall[0][2] + 1) + " scoring " + studentsGradesOverall[0][0]);
        System.out.println("the overall lowest score is scored by student " + (studentsGradesOverall[1][1] + 1) + " in subject " + (studentsGradesOverall[1][2] + 1) + " scoring " + studentsGradesOverall[1][0]);
        System.out.println("===============================================================");
        System.out.println();
        System.out.println("Class summary");
        System.out.println("===============================================================");
        int[][] overallStudents = overallStudent(numbers);
        System.out.println("Best graduating student is: student " + (overallStudents[0][1] + 1) + " scoring " + overallStudents[0][0]);
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst graduating student is: student " + (overallStudents[1][1] + 1) + " scoring " + overallStudents[1][0]);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        int[] totalAndAverage = getTotalAndAverageScore(numbers);
        System.out.println("class total score is: " + totalAndAverage[0]);
        System.out.println("class average score is: " + totalAndAverage[1]);
        
        
        
    }
    
    public int[][] getBestgraduatingStudent(int[][] numbers) {
        int largest = numbers[0][0];
        int smallest = numbers[0][0];
        int largeStudentIndex = 0;
        int largesubjectIndex = 0;
        int smallsubjectIndex = 0;
        int smallestStudentIndex = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                if (numbers[row][column] > largest) {
                    largest = numbers[row][column];
                    largeStudentIndex = row;
                    largesubjectIndex = column;
                } else if (numbers[row][column] < smallest){
                    smallest = numbers[row][column];
                    smallestStudentIndex = row;
                    smallsubjectIndex = column;
                }
            }
        }
        int[][] values = {
        {largest, largeStudentIndex, largesubjectIndex}, 
        {smallest, smallestStudentIndex, smallsubjectIndex}
        };
        return values;
    }
    
    
    public int[] getTotalAndAverageScore(int[][] numbers) {
        int total = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                total += numbers[row][column];
            }
        }
        int[] totalAndAverage = {total, (total / numbers.length)};
        return totalAndAverage;
    }
    
    public int[][] overallStudent(int[][] numbers) {
        int largestTotal = numbers[0][1];
        int bestStudentIndex = 0;
        int worstStudentIndex = 0;
        int smallestTotal = numbers[0][1];
        int total = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                total += numbers[row][column];
            }
            if (total > largestTotal) {
                largestTotal = total;
                bestStudentIndex = row;
            } else if (total < smallestTotal) {
                smallestTotal = total;
                worstStudentIndex = row;
            }
        }
        int[][] values = {
        {largestTotal, bestStudentIndex},
        {smallestTotal, worstStudentIndex}
        };
        return values;
    }
    
}
