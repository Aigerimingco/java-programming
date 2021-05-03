package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("======WELCOME TO ADAIRE APARTMENTS======");
        int numOfBedrooms=6;
        double startingPrice=0;

        switch (numOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice=1454.00;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice=1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice=2899;
                break;
            default:
                System.out.println(numOfBedrooms + " bedroom currently not available");

        }
        System.out.println("Starting price: $" + startingPrice);
    }
}
