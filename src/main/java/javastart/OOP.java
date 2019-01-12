package javastart;

public class OOP {
    public static void main(String[] args) {
     /*   Point2D point2d = new Point2D();
        System.out.println(point2d.getX());
        System.out.println(point2d.getY());

        Point2D point2d_new = new Point2D(3,4);

        System.out.println(point2d_new.getX());
        System.out.println(point2d_new.getY());

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());*/



    }
    public interface X {
        public void doSomething();
    }

    public class X1 implements X {
        public void doSomething(){
            System.out.println("X1");
        }
    }
    X[] tab = new X[100];
//    tab[0] = new X1();
//    tab[1] = new X2();
}
