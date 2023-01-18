package my_package_name.homework_9;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = CollectionOfStudents.generateListOfStudents();

        Student newStudent = new Student("Max", 1);
        CollectionOfStudents.addNewStudent(students, newStudent);

        CollectionOfStudents.removeStudent(students, 0);

        CollectionOfStudents.printStudents(students, 2);
    }

}
