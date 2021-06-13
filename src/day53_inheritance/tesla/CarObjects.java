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
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2= new ElectricCar("Tesla", "CyberTruck", 59900, 2022,300);
        System.out.println(ec2);
        System.out.println("Count = "+ec2.getCount());
        System.out.println("Count = "+ElectricCar.getCount());


        Roadster roadster= new Roadster("Tesla","Roadster", 200000,2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());


        ModelX modelX= new ModelX("Tesla","Model X", 89990, 2021,360);
        System.out.println(modelX);
        modelX.drive(10);
        System.out.println("having lunch...");
        modelX.drive(10);
        System.out.println("Range remaining = "+modelX.getRange());
        System.out.println("Total electric cars count = "+ElectricCar.getCount());


    }
}
