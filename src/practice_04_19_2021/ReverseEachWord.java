package practice_04_19_2021;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
       /* Reverse Each word
        Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
        Input:
        It started to snow in Chicago Output:
        tI detrats ot wons ni ogacihC
                */
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }
    public static String reverseEachWord(String str){
        String reverse="";
        for(String each: str.split(" ")){

            //he we would reverse each String with a for loop
            //going from the last index to the first index

            reverse += StringUtils.reverse(each) +" ";

        }
        return reverse;
    }
}
