package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas=431;
        int hondas=233;
        byte VW=2;
        byte tesla=20;
        byte nissan=1;
        int BMW=155;
        int totalCarsInParking=toyotas+hondas+VW+tesla+nissan+BMW;
        System.out.println("There are "+totalCarsInParking+ " cars in parking lot.");

        String pizza="hawaiian";
        int slices=8;
        int people=4;
        int slicesPerPerson=slices/people;
        System.out.println("There are "+slicesPerPerson+" slices per percon.");
        System.out.println("We ordered "+pizza+ " pizza with "+slices+" slices,"+people+
                " people are "+slicesPerPerson+" each.");
    }
}
