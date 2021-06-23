package day56_abstraction;

import day56_abstraction.greeting.Greeting;

public class driveable {

    public static interface SelfDrivable {
    void autoPilot();
    public default void selfPark(){
        System.out.println("Performing self park steps");
    }

    }

    public abstract static class Transportation {
        public abstract void transportPeople();
        public abstract void cost(int mile);
        public void start(){
            System.out.println("Starting the engine");
        }
        public void stop(){
            System.out.println("Shut off the engine");
        }

        public abstract void land();
    }

    public static class DriveableTest {
        public static void main(String[] args) {
            Tesla model3= new Tesla();
            model3.hi();
            model3.transportPeople();
            model3.autoPilot();
            model3.cost(25);
            model3.stop();
            model3.bye();

            Plane plane=new Plane();
            plane.hi();
            plane.transportPeople();
            plane.autoPilot();
            plane.cost(10);
            plane.stop();
            plane.bye();
            plane.land();

            SelfDrivable sd= new Plane();
            SelfDrivable sd2= new Tesla();

            Transportation tp1= new Plane();
            Transportation tp2= new Tesla();


        }
    }

    public static class Plane extends Transportation implements SelfDrivable, Greeting {
        @Override
        public void transportPeople() {

        }

        @Override
        public void cost(int mile) {
            System.out.println("plane costs "+(mile*0.10)+" to drive "+mile+" miles");
        }

        @Override
        public void land() {
            System.out.println("Plane is landing. Buckle up!");
        }

        @Override
        public void autoPilot() {
            System.out.println("Plane is on autoPilot mode");
        }

        @Override
        public void hi() {
            System.out.println("Welcome aboard");
        }

        @Override
        public void bye() {
            System.out.println("Thanks for flying ewith us");
        }
    }

    public static class Tesla extends Transportation implements SelfDrivable, Greeting {
        @Override
        public void transportPeople() {
            System.out.println("Tesla is transporting people on the roads");
        }

        @Override
        public void cost(int mile) {
            System.out.println("Tesla costs "+(mile*0.10)+" to drive "+mile+" miles");
        }

        @Override
        public void land() {

        }

        @Override
        public void autoPilot() {
            System.out.println("Tesla is driving on autonomous mode");
        }

        @Override
        public void hi() {
            System.out.println("'hello hello' ");
        }

        @Override
        public void bye() {
            System.out.println("bye bye charge me");
        }
    }
}
