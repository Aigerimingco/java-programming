package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {



        Shape triangle= new Triangle();
        triangle.draw();

        Shape circle= new Circle();
        circle.draw();

        Shape square= new Square();
        square.draw();

        /**
         * create list of shapes and store 10
         * different shapes.
         * using a loop print out each shape
         */

        List<Shape> shapeList= new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());
        shapeList.add(new Square());


        for(Shape each: shapeList){
            each.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());
    }


    /**
     * static method:drawShape
     * accepts object of shape
     * then calls draw() method
     */
    public static void drawShape(Shape shape){
        System.out.println("drawing shape");
        shape.draw();
    }
}
