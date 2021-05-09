package day_43_list_custom_classes;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public  static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays().get(0));
        System.out.println(getDays().size());
        List<String> daysNames= getDays();
        System.out.println(daysNames);

        daysNames.removeIf(dayanything -> dayanything.length()==6);
        System.out.println("day names after removeIf"+daysNames);
        System.out.println(getRandomList(10));
        List<Integer>  nums= getRandomList(100);
        System.out.println("nums size= "+nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n<90);
        System.out.println("nums = " + nums);

    }
    public static List<String> getDays(){
        List<String> days= new ArrayList<>(Arrays.asList("Monday", "Tuesday","Wednesday",
                "Thursday","Friday", "Saturday","Sunday"));
        return days;
    }
    /*
    get randomList
    param: int size
    return List<Integer>
    generate randon numbers the count of size, and assign to
    list then return
    getRandomList(3)-> 43,12,54
     */
    public static List<Integer> getRandomList(int size){
        Random random= new Random();
        List<Integer> nums= new ArrayList<>();

        for (int i = 1; i <=size; i++) {
            //nums.add(random.nextInt(101));// prints with duplicates
            int n = random.nextInt(101);//if we dont want duplicates
            if(!nums.contains(n)){
                nums.add(n);
            }
        }
        return nums;


    }
}
