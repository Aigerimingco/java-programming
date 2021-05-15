package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight lights= new TrafficLight();
        //lights.color= "red";

        lights.changeColor("red");
        lights.showColor();
        lights.changeColor("green");
        lights.showColor();

        TrafficLight lights2= new TrafficLight();
        lights2.changeColor("brown");
        lights2.showColor();


    }
}
