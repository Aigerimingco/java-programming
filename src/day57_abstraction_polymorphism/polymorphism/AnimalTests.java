package day57_abstraction_polymorphism.polymorphism;

import day55_abstraction.exercise_example.Lifting;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {

    public static void main(String[] args) {
        Animal a1= new Animal();
        a1.makeNoise();

        Animal animal= new Dog();
        Animal animal2= new Horse();
        Animal animal3= new Cat();


        animal.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        List<Animal> animalList=new ArrayList();
        animalList.add(new Dog());
        animalList.add(new Horse());
        animalList.add(new Cat());
        for(Animal each: animalList){
            each.makeNoise();
        }



    }
}
