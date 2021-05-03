package day41_arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println(myCars.toString());
        String allCarsin1st = myCars.toString();
        System.out.println("allCarsin1st = " + allCarsin1st);

        //change index 0 to Lamborhini
        myCars.set(0, "Lamborhini");
        System.out.println("after set = " + myCars.toString());
        myCars.set(4, "honda");
        System.out.println("replacing mazda =" + myCars.toString());

        /*
        How would you do thatr if myCars in array
        myCars[4]="Honda";
         */
        //find the index number of "ford"

        System.out.println("index of ford  = " + myCars.indexOf("ford"));
        int moskichindex = myCars.indexOf("moskvich");
        System.out.println("moskichindex " + moskichindex);

        myCars.set(moskichindex, "jiguli");
        System.out.println("after set jiguli= " + myCars);

        //System.out.println(myCars.set(5, "trabant")+myCars);
        //myCars.set(myCars.indexOf("ford"),"trabant");
        //System.out.println("after replacement= "+myCars);
        //lada--> bugatti
        /*
        preventing the error out of bounds
        if mycars contains lada
        find index of lada and set value to bugatti
        else
        print "lada is not fount
         */
        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");

        } else {
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti " + myCars.toString());
        /*
        lambotghini--> prius
        lada--> lexus
        trabant--> audi
         */
        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborhini")) {
                myCars.set(i , "prius");
            }else if (myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            }else if (myCars.get(i).equals("jiguli")) {
                myCars.set(i, "audi");
            }

        } System.out.println("after loop "+myCars);
    }

}
