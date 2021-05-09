package day_43_list_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturns {
    public static void main(String[] args) {
       // System.out.println(System.nanoTime());

        long start = System.nanoTime();
        List<Integer> nums1 = getList();
        long end = System.nanoTime();
        System.out.println("ArrayList time= " + (end - start));
        //System.out.println(nums1);


        long st = System.nanoTime();
        int[] arr = getList1();
        long end2 = System.nanoTime();
       // System.out.println(Arrays.toString(arr));
         System.out.println("Array time= " + (end2 - st));
    /*
    getIntegerlIST
    return List<Integer>
    loop from 0 to 1000000
    and add to arraylist
     */
    }

    public static List<Integer> getList() {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);


        }
        return nums;

    }

    /*
   getIntegerArray
   no param
   loop from 0 to 1000000
   and add to int[] then return it
    */
    public static int[] getList1() {
        int[] nums = new int[1000001];

        for (int i = 0; i <= 1000_000; i++) {
            nums[i] = i;


        }
        return nums;

    }
}