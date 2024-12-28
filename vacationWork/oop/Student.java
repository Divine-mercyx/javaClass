package vacationWork.oop;

public class Student extends Person {

    private String studentId;
    private String major;
    private double gpa;

    public Student(String name, int age, String address, String studentId, String major, double gpa) {
        super(name, age, address);
        setStudentId(studentId);
        setMajor(major);
        setGpa(gpa);
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getStudentId() {
        return studentId;
    }


    public void setMajor(String major) {
        this.major = major;
    }


    public String getMajor() {
        return major;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", super.toString(), studentId, major, gpa);
    }
}
