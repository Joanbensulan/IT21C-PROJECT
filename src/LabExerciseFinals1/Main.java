package LabExerciseFinals1;

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Ember Hystia", 2002, "Bachelor of Science in Information Technology");

        System.out.println("Student Info: " + student);
        System.out.println("Student Major: " + student.getMajor());

        Instructor instructor = new Instructor("Joan Bensulan", 9888, 20000);

        System.out.println("Instructor Info: " + instructor);
        System.out.println("Instructor Salary: " + instructor.getSalary());
    }
}