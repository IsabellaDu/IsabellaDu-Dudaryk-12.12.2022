package my_package_name.homework_9;

import java.util.ArrayList;
import java.util.List;

public class StudentsMethodHelper {

    public static void addNewStudent(ArrayList<Student> listOfStudents, Student newStudent) {
        listOfStudents.add(newStudent);
    }

    public static void removeStudent(ArrayList<Student> listOfStudents, int index) {
        listOfStudents.remove(index);
    }

    public static void printStudents(List<Student> students, int course) {
        students.forEach(student -> {
            if (student.course == course) {
                System.out.println(student.name);
            }
        });
    }
}
