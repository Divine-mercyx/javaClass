package mrChibuzor.phaseGateOne;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentGradeTest {
    
    @Test
    public void TestThatStudentsNumberAndSubjectNumberExist() {
        StudentGrade studentGrade = new StudentGrade();
    }
    @Test
    public void getReturnedStudentsNumberAndSubjectNumber() {
        StudentGrade studentGrade = new StudentGrade();
        int studentNumber = 5;
        int subjectNumber = 5;
        int[] actual = studentGrade.getNumberOfStudentsAndSubjects(studentNumber, subjectNumber);
        int[] expected = {5, 5};
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void checkIfcollectScoresForEveryStudentAndSubjectReturns2DArray() {
        StudentGrade studentGrade = new StudentGrade();
        int[] numbers = {3, 3};
        int[][] actual = studentGrade.collectScoresForEveryStudentAndSubject(numbers);
        int[][] expected = new int[3][3];
        assertArrayEquals(actual, expected);
    }
}
