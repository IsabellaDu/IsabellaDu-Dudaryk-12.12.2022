package my_package_name.homework_5;

import java.util.Arrays;
import java.util.Random;

public class TasksAboutArraysAndLoops {
    public static void main(String[] args) {

        // Task 1
        for (int i = 0; i <= 360; i += 10) {
            System.out.println("sin(" + i + "°) = " + Math.sin(i));
        }

        // Task 2
        int[] newArray = createArrayWithRandomNumbers(5);
        System.out.println(Arrays.toString(sortArrayToOddNumbers(newArray)));

        // Task 3
        int[] arrayForCalculateArithmeticMean = createArrayWithRandomNumbers(10);
        System.out.println(findArithmeticMean(arrayForCalculateArithmeticMean));
    }

    public static int[] createArrayWithRandomNumbers(int amountOfItems) {
        int[] arrayOfNumbers = new int[amountOfItems];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Random random = new Random();
            arrayOfNumbers[i] = random.nextInt(100);
        }
        return arrayOfNumbers;
    }

    public static int[] sortArrayToOddNumbers(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }

    public static int findArithmeticMean(int[] arrayOfNumbers) {
        int sumOfNumbers = 0;

        for (int item : arrayOfNumbers) {
            sumOfNumbers += item;
        }
        return sumOfNumbers / arrayOfNumbers.length;
    }
}
