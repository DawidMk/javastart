package pl.sda.javastart.day6.homework;


import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private double width;
    private double heigth;

    public Rectangle() {
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.width = Math.abs(p1.getX() - p2.getX());
        this.heigth = Math.abs(p1.getY() - p3.getY());
    }

    @Override
    public String toString() {
        if (p1.getY() != p2.getY() || p3.getY() != p4.getY() || p1.getX() != p3.getX() || p2.getX() != p4.getX()) {
            return "not a rectangle";
        }
        return "prostokat\nobwód: " + getCircuit() + "\npole: " + getArea() + "\nwierzcholki: " + getEdges().toString() + "\n";
    }

    @Override
    public double getArea() {
        return getHeigth() * getWidth();
    }

    @Override
    public double getCircuit() {
        return 2 * getHeigth() + 2 * getWidth();
    }

    @Override
    public List<Point> getEdges() {
        List list = new ArrayList<>(4);
        list.add(getP1());
        list.add(getP2());
        list.add(getP3());
        list.add(getP4());
        return list;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public double getWidth() {
        return width;
    }


    public double getHeigth() {
        return heigth;
    }

}
