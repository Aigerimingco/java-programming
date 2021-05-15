package day45_oop;

public class TrafficLight {
    String color;
    public void  showColor(){
        System.out.println("current color = "+color);
    }
    public void  changeColor(String newColor){
        if(newColor.equals("red") || newColor.equals("green") || newColor.equals("yellow")) {


            System.out.println("changing color to " + newColor);
            color = newColor;
        }
    }

}
