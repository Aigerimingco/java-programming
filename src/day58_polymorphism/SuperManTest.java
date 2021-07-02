package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
      Father spMan1= new SuperMan();
      spMan1.feedKid();
      spMan1.playWithKid();
      spMan1.raiseKid();

      Worker spMan2= new SuperMan();
        System.out.println("Got paid $"+spMan2.getPaid());
        spMan2.work("SDET");

        SuperMan superMan= new SuperMan();
        superMan.getPaid();
        superMan.work("Scrum Master");
        superMan.feedKid();
        superMan.playWithKid();
        superMan.playWithKid();



    }
}
