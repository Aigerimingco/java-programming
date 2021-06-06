package day50_inheritance;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbull";
        animal.speak();


        Cat cat = new Cat();
        cat.name= "Kiska";
        cat.speak();

        Dog dog = new Dog();
        dog.name= "Aksai";
        dog.speak();

    }
}
