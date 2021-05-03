package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1= " + num1);
        System.out.println("num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));
        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("after swap: " + Arrays.toString(nums));

        int[] nums1 = {5, 10, 4, 100};
        for (int i = 0; i < nums1.length / 2; i++) {
            int temp1 = nums1[i];
            nums1[i] = nums1[nums1.length - 1 - i];
            nums1[nums1.length - 1 - i] = temp1;

        }
        System.out.println("after: " + Arrays.toString(nums1));

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        for (int i = 0, j= words.length-1; i < words.length / 2; i++,j--) {
            String temp1 = words[i];
            words[i] = words[j];
            words[j]= temp1;
        }
        System.out.println("after reverse: " + Arrays.toString(words));

    }
}