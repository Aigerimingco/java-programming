package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 123, 654, 2344, 12345, 14421,1};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 88));
        System.out.println(Arrays.binarySearch(nums, 700));
        System.out.println(Arrays.binarySearch(nums, 2500));
        System.out.println(Arrays.binarySearch(nums, -5));
        System.out.println(Arrays.binarySearch(nums, 150));
        System.out.println(Arrays.binarySearch(nums, 25));
        if(Arrays.binarySearch(nums, 12345)>=0){
            System.out.println("124345 is present in array");
        }else{
            System.out.println("12345 not present");
        }


    }
}
