package vacationWork.oop;

public class Professor extends Person {

    private String professorId;
    private String department;
    private int teachingExperience;

    public Professor(String name, int age, String address, String professorId, String department, int teachingExperience) {
        super(name, age, address);
        setProfessorId(professorId);
        setDepartment(department);
        setTeachingExperience(teachingExperience);
    }


    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }


    public String getProfessorId() {
        return professorId;
    }


    public void setDepartment(String department) {
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }


    public void setTeachingExperience(int teachingExperience) {
        this.teachingExperience = teachingExperience;
    }


    public int getTeachingExperience() {
        return teachingExperience;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", super.toString(), professorId, department, teachingExperience);
    }
}
