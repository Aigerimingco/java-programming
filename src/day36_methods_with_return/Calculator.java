package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("sum: " + add(545665767.5, 344444.6789));
        System.out.println("subtract: " + substract(45.67, 23.12));
        System.out.println("multiply: " + multiply(9, 6));
        System.out.println("divide: " + divide(98, 7));
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double substract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}