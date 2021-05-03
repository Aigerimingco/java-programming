package day30_arrays;

public class ArrayLoppWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        for (double each : prices) {
            if (each > 100) {

                System.out.print(each + " ");
            }
        }
        System.out.println("\n--------prices between  10 and 70--------");
        for (double each : prices) {
            if (each >= 10 && each <= 70) {
                System.out.print(" each = " + each);
            }
        }
        System.out.println("\n------ count the prices that are more than 50-------");
        int count = 0;
        for (double each : prices) {
            if (each > 50) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("\n====countries with name more than 7- inclusive");
        for (String eachCountry : countries) {
            if (eachCountry.length() >= 7) {
                System.out.println(eachCountry+" "+ eachCountry.length());
            }
        }
    }
}


