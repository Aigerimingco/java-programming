package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String model = "E";
        String make = "Mercedes";
        double leasePrice = 0.0;


        if (model.equals("E") == make.equals("Mercedes")) {
            leasePrice = 500.0;
            System.out.println("Lease price: " + leasePrice);
        } else if (model.equals("A") == make.equals("Mercedes")) {
            leasePrice = 400;
        }
        System.out.println("make = " + make);
        System.out.println("model = "+model);
        System.out.println("leasePrice = "+leasePrice);


    }
}