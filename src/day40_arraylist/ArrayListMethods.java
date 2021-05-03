package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList= new ArrayList<>();
        System.out.println("size = "+shoppingList.size());
        System.out.println("isEmpty? = "+shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        shoppingList.add("jacket");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }
        int count=shoppingList.size();
        System.out.println("items to buy = " + count);

        System.out.println("is shoes in my list? "+shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("shoes is in the list");
        }else{
            System.out.println("shoes is not in the list");
        }
        System.out.println("buying shoes .....$80");
        shoppingList.remove("shoes");

        System.out.println("shopping list = "+shoppingList);


        shoppingList.clear();
        System.out.println(shoppingList);

    }
}
