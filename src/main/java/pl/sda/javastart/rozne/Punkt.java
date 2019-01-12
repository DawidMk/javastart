package pl.sda.javastart.rozne;

public class Punkt {
    int punktX;
    int punktY;

    public int getPunktY() {
        return punktY;
    }

    public void setPunktY(int punktY) {
        this.punktY = punktY;
    }

    public void setPunktX(int punktX) {
        this.punktX = punktX;
    }

    public int getPunktX() {

        return punktX;
    }
    public int increaseX(){
        punktX++;
        return punktX;
    }
    public int increaseY(){
//        punktY++;
        return 1+punktY;
    }
    public int increaseXbyN(int n){
//        punktX= n+punktX;
        return punktX+n;
    }

}
