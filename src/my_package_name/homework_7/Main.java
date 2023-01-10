package my_package_name.homework_7;

public class Main {
    public static void main(String[] args) {

        // Task 7
        Person firstPerson = new Person("Will", "Smith", "New York", "2936729462846");
        Person secondPerson = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person thirdPerson = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(firstPerson.call());
        System.out.println(secondPerson.call());
        System.out.println(thirdPerson.call());

        // Task 8
        System.out.println(firstPerson.call(firstPerson));
        System.out.println(firstPerson.call(thirdPerson));

        // Task 9-10
        PersonAbroad personAbroad = new PersonAbroad("Ivan", "Ivanov", "Kyiv", "12443485226", true);

        System.out.println(personAbroad.call());
        System.out.println(personAbroad.call(thirdPerson));
        System.out.println(personAbroad.useData());
    }
}
