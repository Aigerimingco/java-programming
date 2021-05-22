package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1= new Car();
        // ERROR  below, model and year are PRIVATE and can not be access
        //car1.model="Nissan Altima";
        //car1.year=2020;
        car1.setModel("Nissan Altima");
        System.out.println(car1.getModel());
        car1.setYear(2016);
        System.out.println(car1.getYear());
        car1.setMileage(120000);
        System.out.println(car1.getMileage());

        System.out.println("car1 = " + car1);

        Car alfaRomeo= new Car();
        alfaRomeo.setModel("Alfa romeo");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16000);

        System.out.println("alfaRomeo.getModel() = " + alfaRomeo.getModel());
        System.out.println("alfaRomeo.getYear() = " + alfaRomeo.getYear());
        System.out.println("alfaRomeo.getMileage() = " + alfaRomeo.getMileage());

        System.out.println(alfaRomeo);


    }

}
