package day37_methods_overloading;

import jdk.nashorn.internal.lookup.MethodHandleFactory;

import java.util.logging.Logger;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println("days of the week "+ getDayName(1)+", " +getDayName(2)+", "+getDayName(3));
        for (int i = 1; i <= 9; i++) {
            System.out.println(i+" = "+getDayName(i));

        }
        int i=7;
        String days=getDayName(i);
        System.out.println(days);
        String someDay=getDayName(0);
        if(someDay==null){

            System.out.println("Some day is null. Invalid day");
        }
    }

    public static String getDayName(int day) {

        switch (day) {
            case 1: return "Monday";
            case 2: return "tuesday";
            case 3: return "wednesday";
            case 4: return "thursday";
            case 5: return "friday";
            case 6: return "saturday";
            case 7: return "sunday";
            default:
                System.out.println("invalid day "+day);
                return null;
        }
    }
}

