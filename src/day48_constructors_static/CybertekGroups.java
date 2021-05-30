package day48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
       Group group1 = new Group("Cyberbugs");// dependency injection.
        // print size of members

        System.out.println(group1.getMembers().size());

        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Akrem", "Andrea", "Bulent"));

        System.out.println(group2.getMembers());

        // use if statement to check Akrem is in group2
        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is exist");
        }else{
            System.out.println("Akrem does not exist");
        }





    }
}
