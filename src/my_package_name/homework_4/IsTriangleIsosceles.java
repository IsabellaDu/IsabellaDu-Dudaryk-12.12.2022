package my_package_name.homework_4;

public class IsTriangleIsosceles {
    public static void main(String[] args) {
        System.out.println(isTriangleIsosceles(1, 6, 6));
    }

    public static String isTriangleIsosceles(int firstSide, int secondSide, int thirdSide) {

        if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            return "The triangle is isosceles.";
        }
        return "The triangle is not isosceles.";

    }
}
