package OfficeHours.Practice_05_18_2021;

import java.util.Arrays;
import java.util.Locale;

public class Mutability {
    public static void main(String[] args) {
        String one = "java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println("three = " + three);
        System.out.println(two == three);

        System.out.println(two.toUpperCase() == three);

        one= one.substring(2);
        System.out.println(one);
        System.out.println(two);

        int[] arr={1,2,3};
        int[] arr2=arr;
        arr[0]=100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


    }
}
