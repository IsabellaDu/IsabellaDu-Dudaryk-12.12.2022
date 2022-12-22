package my_package_name.homework_4;

public class ParityOfNumber {

    public static void main(String[] args) {

        System.out.println(checkOddEven(4));
        System.out.println("BYE");

    }

    public static String checkOddEven(int number) {
        String numberProperty;
        if (number % 2 != 0) {
            numberProperty = "Odd Number";
        } else {
            numberProperty = "Even Number";
        }
        return numberProperty;

    }

}
