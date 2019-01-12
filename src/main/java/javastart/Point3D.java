package javastart;

public class Point3D extends Point2D {
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = 0;

    }

}
