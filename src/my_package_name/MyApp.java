package my_package_name;

public class MyApp {
    public static void main(String[] args) {
        int lengthOfParallelepiped = 2;
        int widthOfParallelepiped = 3;
        int heightOfParallelepiped = 4;

        int volume = lengthOfParallelepiped * widthOfParallelepiped * heightOfParallelepiped;
        int length = (lengthOfParallelepiped + widthOfParallelepiped + heightOfParallelepiped) * 4;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + length);
    }
}
