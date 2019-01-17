package pl.sda.javastart.day6.homework;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    @Override
    public String toString() {
        return "wierzcholek{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
