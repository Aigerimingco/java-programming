package day57_abstraction_polymorphism.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle= new Triangle();
        triangle.draw();

        Shape circle= new Circle();
        circle.draw();

        Shape square= new Square();
        square.draw();
    }
}
