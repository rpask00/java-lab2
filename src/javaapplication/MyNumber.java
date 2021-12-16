package javaapplication;

public  class MyNumber {
    int value;


    public MyNumber(int value) {
        this.value = value;

    }

    boolean isOdd() {
        return value % 2 == 1;
    }


    boolean isEven() {
        return !isOdd();
    }

    double sqrt() {
        return Math.sqrt(value);
    }

    public double pow(int x) {
        return Math.pow(value, x);
    }

    public double pow(MyNumber x) {
        return x.pow(x.value);
    }

    double add(int x) {
        return value + x;
    }

    double subtract(int x) {
        return value - x;
    }


}