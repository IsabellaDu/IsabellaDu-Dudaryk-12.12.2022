package my_package_name.homework_8;

public class CompareObjectException extends ArithmeticException {
    CompareObjectException(int age) {
        super("incorrect age is: " + age);
    }

}
