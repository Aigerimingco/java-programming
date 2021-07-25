package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList< Integer> nums= new ArrayList<>();
        List<String> cities= new ArrayList<>();// polymorphism
        Collection<String> schools= new ArrayList<>();// polymorphism

        cities.add("McLean");// add method from Collection or List interface
        cities.add("Vienna");
        cities.add("SLC");
        cities.add("SLC");

        System.out.println(cities.toString());

        System.out.println("first city: "+cities.get(0));
        System.out.println("count of cities = "+cities.size());


    }
}
