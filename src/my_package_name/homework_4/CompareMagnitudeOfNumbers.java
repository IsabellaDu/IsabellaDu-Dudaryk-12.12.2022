package my_package_name.homework_4;

public class CompareMagnitudeOfNumbers {

    public static void main(String[] args) {

        System.out.println(compareMagnitudeOfNumbers(2, -4) + " has bigger magnitude");
    }

    public static Integer compareMagnitudeOfNumbers(int firstNum, int secondNum) {
        return Math.abs(firstNum) > Math.abs(secondNum) ? firstNum : secondNum;
    }
}
