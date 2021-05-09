package OfficeHours.Practice_05_05_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOnlyLetters {
    /*
    Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
Input:   str = "----qwe--r--tyf...gd.---"

Output:  str = "----dgf--y--tre...wq.---"
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec("Ab,c,de!$"));

    }

    public static String reverseNoSpec(String str) {

        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));
        for (int i = 0, j=letters.length-1; i < letters.length/2; i++) {
            if(Character.isLetter(letters[i])){
                for (; j >=0 ; j--) {
                    if(Character.isLetter(letters[j])){
                        char temp=letters[i];
                        letters[i]=letters[j];
                        letters[j--]=temp;
                        break;

                    }

                }

            }

        }
        //return Arrays.toString(letters).replace("[","").replace("]","").replace(
            //    ",","");
        return String.valueOf(letters);



    }
}






