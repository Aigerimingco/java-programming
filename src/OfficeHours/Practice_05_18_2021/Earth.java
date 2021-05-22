package OfficeHours.Practice_05_18_2021;

public class Earth {

    public static void main(String[] args) {

        animalSpecies dogs= new animalSpecies();
        dogs.setInfo("dogs",50,10);
        System.out.println(dogs);

        animalSpecies cats= new animalSpecies();
        cats.setInfo("cats", 100,15);
        System.out.println(cats);

        animalSpecies birds=cats;
        cats.setInfo("birds", 200,20);
        System.out.println("birds = " + birds);

    }
}
