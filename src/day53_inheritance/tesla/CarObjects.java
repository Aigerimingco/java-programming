package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "model y",48000, 2021, 326);
        electricCar.drive(50);
        System.out.println(electricCar);

        System.out.println("electric car make= "+electricCar.getMake());
        System.out.println("electric car model= "+electricCar.getModel());
        System.out.println("electric car price= "+electricCar.getPrice());
        System.out.println("electric car year= "+electricCar.getYear());
        System.out.println("electric car range= "+electricCar.getRange());

        if(electricCar.getPrice()>10000){
            System.out.println(electricCar.getMake()+" - "+electricCar.getModel()+" is out of my budget");

        }else{
            System.out.println("purchasing "+electricCar);
        }

    }
}
