package pl.sda.javastart.day6.homework;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private double side;

    public Square() {
    }

    public Square(Point p1, double side) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.side = side;
    }

    @Override
    public String toString() {
        return "kwadrat\nobwód: " + getCircuit() + "\npole: " + getArea() + "\nwierzchołki: " + getEdges().toString() + "\n";
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getCircuit() {
        return 4 * getSide();
    }

    @Override
    public List<Point> getEdges() {
        List list = new ArrayList<>(4);
        Point p2 = new Point((int) (p1.getX() + side),p1.getY());
        Point p3 = new Point((int) (p1.getX() + side),(int) (p1.getY() + side));
        Point p4 = new Point(p1.getX(),(int) (p1.getY() + side));

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
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

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}



/*BACKUP CODE
package pl.sda.javastart.day6.homework;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private double side;

    public Square() {
    }

    public Square(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.side = Math.abs(p1.getX() - p2.getX()); //zakładam, że punkty są wyznaczane za każdym razem w tej samej kolejności

    }

    @Override
    public String toString() {
//        if(p1.getX()!=p3.getX()|| p1.getY()!=p2.getY()){ //todo dodać warunki dla p4
        if (p1.getX() - p2.getX() != p1.getY() - p3.getY()) {
            return "not a square!";
        }
        return "kwadrat\nobwód: " + getCircuit()
                + "\npole: " + getArea() + "\nwierzcholki: "
                + getEdges().toString() + "\n";
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getCircuit() {
        return 4 * getSide();
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

    public double getSide() {
        return side;
    }

    public void setSide(Point p1, Point p2, Point p3) {
        if (p1.getY() - p2.getY() != 0) {
            this.side = Math.abs(p1.getY() - p2.getY());
        } else if (p2.getY() - p3.getY() != 0) {
            this.side = Math.abs(p2.getY() - p3.getY());
        }
    }
}
 */
