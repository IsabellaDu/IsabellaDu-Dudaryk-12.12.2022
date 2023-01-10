package my_package_name.homework_7;

import java.util.Objects;

public class Person implements Callable {
    String name;
    String surname;
    String city;
    String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String call() {
        return "Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phoneNumber;
    }

    public String call(Person anotherPerson) {

        if (this.name.equals(anotherPerson.name) && this.surname.equals(anotherPerson.surname) && this.city.equals(anotherPerson.city) && this.phoneNumber.equals(anotherPerson.phoneNumber)) {
            return "Неможливо телефонувати самому собі";
        } else {
            return "Громадянин " + this.name + " " + this.surname + " телефонує громадянину " + anotherPerson.name + " " + anotherPerson.surname + " на номер " + anotherPerson.phoneNumber;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city) && Objects.equals(phoneNumber, person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, city, phoneNumber);
    }
}
