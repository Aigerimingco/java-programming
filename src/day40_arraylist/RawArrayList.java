package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list1= new ArrayList();
        List list2= new ArrayList<>();

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add(123);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
    }
}
