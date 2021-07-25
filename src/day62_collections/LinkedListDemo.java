package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends= new LinkedList<>();
        List<Integer> scores= new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("0 = "+scores.get(0));
        System.out.println("1 = "+scores.get(1));

        friends.add("Mahliya");
        friends.add("Abbas");
        friends.add("Nevzat");

        friends.addFirst("john");
        System.out.println(friends);

        System.out.println(friends.getLast());
    }
}
