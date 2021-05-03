package day37_methods_overloading;

public class GetDayName2 {
    public static void main(String[] args) {
        System.out.println(getDayName2(5));

    }

    public static String getDayName2(int day) {
        String dayName;
        switch (day) {
            case 1: dayName = "Monday";break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday";break;
            case 4: dayName = "Thursday";break;
            case 5: dayName = "Friday";break;
            case 6: dayName = "Saturday";break;
            case 7: dayName = "Sunday";break;
            default:
                System.out.println("Invalid day= " + day);
                dayName = null;
        }
    return dayName;

    }
}
