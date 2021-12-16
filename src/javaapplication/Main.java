package javaapplication;

public class Main {

    public static void main(String[] args) {
        Human nc = new Human(14, 213, 90, "Adam", "Machyzi");

        Prostokat prostokat = new Prostokat(34, 34);

        MyNumber mynumber = new MyNumber(213);

        MyNumber mynumber2 = new MyNumber(2);
        Okrag okrag = new Okrag(3,4,7);

        mynumber.pow(mynumber2);
    }
}
