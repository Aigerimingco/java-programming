package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {0, 5, 7, 1, -4, 44, 33, 100};
        //print all nums in one line
        System.out.println(Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value:" + nums[0]);
        System.out.println("max value:" + nums[nums.length - 1]);

        // Arrays.sort(nums, Collection.reverseOrder());

        String[] word = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(Arrays.toString(word));
        System.out.println( "[" + String.join("," + word + "]"));
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));

        Arrays.sort(word, Collections.reverseOrder());

        System.out.println(Arrays.toString(word));
    }
}
