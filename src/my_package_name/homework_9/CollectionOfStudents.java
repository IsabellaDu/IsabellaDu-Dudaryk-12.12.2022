package my_package_name.homework_9;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfStudents {

    public static ArrayList<Student> generateListOfStudents() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 1));
        students.add(new Student("Ivanna", 2));
        students.add(new Student("Marina", 2));
        return students;
    }

    public static ArrayList<Student> addNewStudent(ArrayList<Student> listOfStudents, Student newStudent) {
        listOfStudents.add(newStudent);
        return listOfStudents;
    }

    public static ArrayList<Student> removeStudent(ArrayList<Student> listOfStudents, int index) {
        listOfStudents.remove(index);
        return listOfStudents;
    }

    public static void printStudents(List<Student> students, int course) {
        students.forEach(student -> {
            if (student.course == course) {
                System.out.println(student.name);
            }
        });
    }
}
