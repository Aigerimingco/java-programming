package day62_collections;

import java.util.*;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums= new Vector<>();
        List<String> states= new Vector<>();
        states.add("MA");
        states.add("VA");
        states.add("IL");
        states.add("UT");
        states.add("ND");
        states.add("FL");
        states.add("TX");
        states.add("MD");

        System.out.println(states);
        // vector is synchronized

    }
}
