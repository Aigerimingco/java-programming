package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String>cities =new ArrayList<>();
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Adana");//2
        cities.add("LA");//3
        //ass Ashkabat to 0 index
        cities.add(0,"Ashkabad");

        System.out.println(cities);
        //print first and last city
        System.out.println("first city= "+ cities.get(0));
        System.out.println("last city= "+cities.get(cities.size()-1));
        //pribnt count of items in arraylist
        System.out.println("count of items= "+cities.size());
        int size= cities.size();
        System.out.println("size = " + size);
        //for loop and print all the values in same line
        for(int i=0;i<cities.size(); i++){
            System.out.print(cities.get(i)+", ");
        }
        System.out.println();
        for (String each:cities ) {
            System.out.print(each + " ");
        }
        System.out.println();
            //delete item from arraylist
            //remove using index
            cities.remove(3);
            //System.out.println("removed index 3 = " +);
        //remove using object
        cities.remove("New York");
        System.out.println("cities removed = " + cities);

        //remove everything
        cities.clear();
        //print
        System.out.println("all clear cities = " + cities);
        //using isEmpty
        System.out.println("list is empty");
        //check size==0
        if(cities.size()==0){
            System.out.println("list is empty");
        }



    }
}
