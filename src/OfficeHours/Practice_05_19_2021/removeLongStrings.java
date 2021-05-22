package OfficeHours.Practice_05_19_2021;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLongStrings {
    /*
    Remove Long Strings
        This method will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings
        Ex: {“one,”, “two”, “three, “four”, “five”, “six”} Max number: 4
        Output: {“three, “four”, “five”
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(removeLongStrings(list, 4));

    }

    public static ArrayList<String> removeLongStrings(ArrayList<String> list, int minLength) {
        ArrayList<String> validStrings = new ArrayList<>();
        for (String word : list) {
            if (word.length() >= minLength) {
                validStrings.add(word);

            }

        }
        return validStrings;

    }

    public static ArrayList<String> removeLongString(ArrayList<String> list, int minlength) {
        list.removeIf(each -> each.length() < minlength);
        return list;
    }

}
