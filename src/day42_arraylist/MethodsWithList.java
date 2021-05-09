package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        /*
        methodName: printStrList
        param: List of Strings
        return: void
        pront all values separated by space in same line
         */
       List<String> list= new ArrayList<>();

        list.add("java"); list.add("selenium"); list.add("a");
        list.add("html"); list.add("input");list.add("title");
        printStrList(list);

        List<Integer> nums= Arrays.asList(23,45,3,78,45);
        System.out.println();
        System.out.println(sumIntegerList(nums));


    }public static void printStrList(List<String> stringList ){
        for (String str: stringList) {
            System.out.print(str+" ");

        }

    }public static int sumIntegerList (List<Integer>integers ){
        int sum=0;
        for(Integer i: integers){
            sum+=i;
        }
        return sum;
    }
}
