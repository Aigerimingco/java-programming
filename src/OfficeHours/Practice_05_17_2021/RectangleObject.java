package OfficeHours.Practice_05_17_2021;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();

        rectangle.setDimensions(5,3);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.toString());

        Rectangle rectangle2= new Rectangle();
        System.out.println(rectangle2.getArea());
    }
}
