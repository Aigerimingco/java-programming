package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println("isHungry " + isHungry() + " always \uD83E\uDD6A \uD83C\uDF2E \uD83C\uDF57");
        System.out.println(getAge());
        System.out.println("random year: " + getRandomYear());
        System.out.println("random year: " + getRandomYear());
        String name = fullName();
        boolean status = isHungry();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("Full name: "+name + "\nStatus: " + status + "\nAge: " + age + "\nRandon year: " + year);
    }

    public static String fullName() {
        return "Aigerim Ingco";
    }

    public static boolean isHungry() {
        return true;
    }

    public static int getAge() {
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
