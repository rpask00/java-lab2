package javaapplication;

public class Okrag {
    int x, y, r;
    Punkt srodek;

    public Okrag() {

    }

    public Okrag(int xx, int yy, int rr) {
        this.r= rr;
        this.srodek = new Punkt(xx,yy);
    }


    public double getPowierzchnia() {
        return (3.14 * r * r);
    }

    public double getObwod() {
        return 2 * (3.14 * r);
    }

    public int getpormien() {
        return r;
    }

    public int getSrednica() {
        return 2*getpormien();
    }


    public boolean wSrodku(int x2, int y2) {
        double distance = Math.sqrt(Math.pow(srodek.x- x2,2) + Math.pow(srodek.y-y2,2));

        return distance <= r;
    }

    
}
