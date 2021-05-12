package day44_custom_classses;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.type="otters";
        System.out.println(animal.type);
        animal.eat("everything");
        animal.speak("gibberish");
        //create object cheetahObj

        Animal cheetahObj= new Animal();
        cheetahObj.type="cheetah \uD83D\uDC05";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("animals");
        cheetahObj.speak("gibberish");

    }
}
