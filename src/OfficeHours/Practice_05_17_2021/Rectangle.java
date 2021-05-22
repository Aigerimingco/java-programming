package OfficeHours.Practice_05_17_2021;

public class Rectangle {

        double height, width, area;


        public void setDimensions(double recHeight, double recWidth){
            height = recHeight;
            width = recWidth;
            area = height * width;
        }
        public double getArea(){
            return area;

        }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}



