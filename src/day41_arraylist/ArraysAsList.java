package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 4, 5, 3);
        System.out.println("nums = " + nums);
        //nums.add(100); doesnot work cuz when we use Arrays.asList it will return immutable list,that
        // size cannot be modified
        //nums.remove(0); doesnt work again cuz we cant change anything
        //solution
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(10, 4, 5, 3));
        nums1.add(456);
        nums1.add(100);
        System.out.println("nums1 = " + nums1);
        nums1.remove(0);
        System.out.println("nums1 = " + nums1);
        nums1.remove(new Integer(5));
        System.out.println("nums1 = " + nums1);
        
        /*
        List String drinkswithCaffeine-> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha
         */
        List<String> drinks = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew"
                , "kambucha", "celsius"));
        System.out.println("drinks = " + drinks);

        int caffeineAmount = 0;
        for (String eachdrink : drinks) {
            if (eachdrink.equals("monster") || eachdrink.equals("red bull") || eachdrink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(eachdrink + "-->" + caffeineAmount);
            } else if (eachdrink.equals("mdew") || eachdrink.equals("coke") || eachdrink.equals("pepsi")) {
                caffeineAmount = 112;
                System.out.println(eachdrink + "-->" + caffeineAmount);
            } else if (eachdrink.equals("tea") || eachdrink.equals("coffee") || eachdrink.equals("kambucha")) {
                caffeineAmount = 35;
                System.out.println(eachdrink + "-->" + caffeineAmount);
            }
        }

        for (String eachdrinks : drinks)
            switch (eachdrinks) {
                case "monster":
                case "red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println("switch " + eachdrinks + "-->" + caffeineAmount);
                    break;
                case "mdew":
                case "coke":
                case "pepsi":
                    caffeineAmount = 112;
                    System.out.println("switch " + eachdrinks + "-->" + caffeineAmount);
                    break;
                case "tea":
                case "coffee":
                case "kambucha":
                    caffeineAmount = 35;
                    System.out.println("switch " + eachdrinks + "-->" + caffeineAmount);
                    break;

            }
drinks.forEach(drinks1-> System.out.println(drinks1.toUpperCase()));
        
        drinks.forEach(drinks2->{
            System.out.println("drinks2 = " + drinks2);
        });
        List<Integer> nums4=Arrays.asList(2, 4,5);
        nums4.forEach(n-> System.out.println(n* n));



    }
}