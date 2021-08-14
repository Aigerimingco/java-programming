package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples2 {
    public static void main(String[] args) {
        //id, Person

        Map<Integer, Person> map= new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(null, new Person("",0));


        System.out.println(map.get(31));
        System.out.println(map.get(32));
        System.out.println(map.get(null));

    }
}
