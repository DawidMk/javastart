package pl.sda.javastart.day6.homework;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Figure {
    private Point p1;
    private Point p2;
    private final double PI = Math.PI;
    private double r;

    public Circle() {
    }

    public Circle(Point p1, double r) {
        this.p1 = p1;
        this.p2 = p2;
        this.r = r;
    }

    @Override
    public String toString() {
        return "koło\nobwód: " + String.format("%.2f", getCircuit()) + "\npole: " + String.format("%.2f", getArea()) + "\nwierzchołki(?): " + getEdges().toString() + "\n";
    }

    @Override
    public double getArea() {
        return getPI() * Math.pow(getR(), 2);
    }

    @Override
    public double getCircuit() {
        return 2 * getPI() * r;
    }

    @Override
    public List<Point> getEdges() {
        List list = new ArrayList<>(2);
        Point p2 = new Point(p1.getX(), (int) (p1.getY() + r));
        list.add(p1);
        list.add(p2);
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

    public double getR() {
        return r;
    }

    public double getPI() {
        return PI;
    }

    public void setR(double r) {
        this.r = r;
    }
}


/* BACKUP CODE
import java.util.ArrayList;
import java.util.List;

public class Circle extends Figure {
    private Point p1;
    private Point p2;
    private final double PI = Math.PI;
    private double r;

    public Circle() {
    }

    public Circle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        if (p1.getY() - p2.getY() != 0) {
            this.r = Math.abs(p1.getY() - p2.getY());
        } else if (p1.getX() - p2.getX() != 0) {
            this.r = Math.abs(p1.getX() - p2.getX());
        }
    }

    @Override
    public String toString() {
        return "kolo\nobwód: " + String.format("%.2f",getCircuit())
                + "\npole: " + String.format("%.2f",getArea())
                + "\nwierzcholki(?): " + getEdges().toString() + "\n";
    }

    @Override
    public double getArea() {
        return getPI() * Math.sqrt(getR());
    }

    @Override
    public double getCircuit() {
        return 2 * getPI() * r;
    }

    @Override
    public List<Point> getEdges() {
        List list = new ArrayList<>(2);
        list.add(getP1());
        list.add(getP2());
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

    public double getR() {
        return r;
    }

    public double getPI() {
        return PI;
    }
}*/
