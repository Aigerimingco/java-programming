package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget=10_000;
        double carPrice=9_990.0;
        String model="chevy";
        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("You can afford this car "+ model + " price = $" +carPrice);
        }else{
            System.out.println("Look for cheaper cars");
        }
    }
}
