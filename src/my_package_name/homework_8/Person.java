package my_package_name.homework_8;

public class Person implements Comparable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean compareByName(String name) {
        return this.name.equals(name);
    }

    @Override
    public boolean compareByAge(int age) {
        return this.age == age;
    }

    @Override
    public boolean compareAllInfo(Object obj) {
        return this.equals(obj);
    }

    public void checkAge(int age) throws CompareObjectException {
        if (age <= 0) {
            throw new CompareObjectException(age);
        }
    }
}
