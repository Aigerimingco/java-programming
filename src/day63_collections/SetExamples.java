package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list ->ArrayList
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);

        System.out.println(set);

        Set<String> words= new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println(words);


        for(String word :words) {

        }
            //convert your set to a List
            List<String> wordList = new ArrayList<>(words);
            System.out.println(wordList.get(0));



            //LinkedHashSet
        Set<String> linkedHashSet=  new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("53");
        linkedHashSet.add("cucumber");
        linkedHashSet.add("java");
        System.out.println(linkedHashSet);

        //treeSet
        Set<String> treeSet=  new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("53");
        treeSet.add("Cucumber");
        treeSet.add("java");
        System.out.println(treeSet);
        //((TreeSet)treeSet).first();




    }
}
