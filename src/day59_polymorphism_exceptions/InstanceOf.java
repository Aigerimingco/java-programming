package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if(shape instanceof  Circle){
            System.out.println("It is a Circle object");
        }else if(shape instanceof Square){
            System.out.println("It is a Square object");
        }
        /**
         * java reflection API
         */
        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());
        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a Square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el= new Link();
        System.out.println("object class name of el variable "+el.getClass().getSimpleName());
       // System.out.println(el.getClass().getDeclaredFields());
    }
}
