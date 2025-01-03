package oldSnack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentGradeTest {
    
    @Test
    public void TestThatStudentsNumberAndSubjectNumberExist() {
        StudentGrades studentGrade = new StudentGrades();
    }
    @Test
    public void getReturnedStudentsNumberAndSubjectNumber() {
        StudentGrades studentGrade = new StudentGrades();
        int studentNumber = 5;
        int subjectNumber = 5;
        int[] actual = studentGrade.getNumberOfStudentsAndSubjects(studentNumber, subjectNumber);
        int[] expected = {5, 5};
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void checkIfcollectScoresForEveryStudentAndSubjectReturns2DArray() {
        StudentGrades studentGrade = new StudentGrades();
        int[] numbers = {3, 3};
        int[][] actual = studentGrade.collectScoresForEveryStudentAndSubject(numbers);
        int[][] expected = new int[3][3];
        assertArrayEquals(actual, expected);
    }
}
