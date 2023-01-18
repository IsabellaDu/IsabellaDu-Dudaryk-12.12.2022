package my_package_name.homework_9;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        StudentsMethodHelper.addNewStudent(students, new Student("Ivan", 1));
        StudentsMethodHelper.addNewStudent(students, new Student("Ivanna", 2));
        StudentsMethodHelper.addNewStudent(students, new Student("Marina", 2));
        StudentsMethodHelper.addNewStudent(students, new Student("Max", 1));

        StudentsMethodHelper.removeStudent(students, 0);

        StudentsMethodHelper.printStudents(students, 2);
    }

}
