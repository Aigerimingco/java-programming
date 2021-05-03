package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34);
        nums.add(56);
        nums.add(87);
        nums.add(890);
        nums.add(314);
        nums.add(34);
        nums.add(45);
        nums.add(23);
        nums.add(10);
        nums.add(3);

        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("nums = " + nums);

        // nums.remove(88); thinks as index88->indextoutofbounds
        // System.out.println(nums);

        nums.remove(new Integer(87));
        System.out.println("nums 87 value remove = " + nums);
        // for loop - iterate through all values and print
        int sum=0;
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
             sum+=nums.get(i);
            
        }
        System.out.println("sum = " + sum);

            //for each loop, and print all in same line
        for (int each : nums){
            System.out.print(each+" ");

        }
        

    }
}
