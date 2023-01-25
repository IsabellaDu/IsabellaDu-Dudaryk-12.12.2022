package my_package_name.homework_11;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");

        long amountOfFruitsWhichStartWithA = fruits.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(amountOfFruitsWhichStartWithA);

        fruits.stream().filter(s -> s.length() > 4).forEach(System.out::println);

        int sumOfThreeElementsFromList = fruits.stream().limit(3).mapToInt(String::length).sum();
        System.out.println(sumOfThreeElementsFromList);
    }
}
