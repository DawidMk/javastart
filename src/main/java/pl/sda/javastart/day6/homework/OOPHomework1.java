package pl.sda.javastart.day6.homework;


import java.util.ArrayList;
import java.util.List;

public class OOPHomework1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Point point1 = new Point(0,0);
        Point point2 = new Point(2,0);
        Point point3 = new Point(0,2);
        Point point4 = new Point(2,2);
        Point point5 = new Point(0,3);
        Point point6 = new Point(2,3);

        Square square2 = new Square(point1,point2,point3,point4);
        Rectangle rectangle2 = new Rectangle(point1,point2,point5,point6);
        Circle circle2 = new Circle(point1,point2);

        System.out.println(square2.toString());
        System.out.println(rectangle2.toString());
        System.out.println(circle2.toString());

    }
}
