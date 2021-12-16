package javaapplication;

public class Prostokat {

    int width, height;

    public Prostokat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int pole() {
        return width * height;
    }

    public int obwod() {
        return 2 * (width + height);

    }

    public double przekatna() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }



}
