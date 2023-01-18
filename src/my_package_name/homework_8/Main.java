package my_package_name.homework_8;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        File file = new File("myFile");
        try {
            FileReader reader = new FileReader(file);
        } catch (Exception e) {
            logger.warnMessage(e.getMessage());
        }

        Person person = new Person("Ivan", -10);
        Person anotherPerson = new Person("Ivan", 10);

        System.out.println(person.compareAllInfo(anotherPerson));
        System.out.println(person.compareByAge(anotherPerson.age));
        System.out.println(person.compareByName(anotherPerson.name));

        /*
        try {
            person.age = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        */

        person.checkAge(person.age);
    }


}
