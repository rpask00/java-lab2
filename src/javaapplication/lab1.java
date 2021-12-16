/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * @author w64882
 */
public class lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt(10);
    int b = scan.nextInt(10);
    int c = _getRandomNumber(a,b);

    System.out.println(zadanie8(a,b,c));
    }

    public static int zadanie1() {
        return 21;
    }


    public static String zadanie2() {
        return "Rafal";
    }

    public static void zadanie3(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("Suma: ");
        System.out.println(a + b);
        System.out.println("Różnica: ");
        System.out.println(a - b);
        System.out.println("Iloczyn: ");
        System.out.println(a * b);
    }

    public static boolean zadanie4(int a) {
        return a % 2 == 0;
    }

    private static int _getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static boolean div_by_3(int a) {
        if (a < 10) {
            return a == 9 || a == 3;
        }

        String str = String.valueOf(a);
        int suma = 0;


        for (int i = 0; i < str.length(); i++) {
            suma += str.charAt(i) - '0';
        }

        return div_by_3(suma);
    }



    public static boolean div_by_5(int a) {
        if(a<10){
            return a == 5 || a == 0;
        }

        return div_by_5(a - (a / 10) * 10);
    }

    public static boolean zadanie5(int a) {
        return div_by_3(a) && div_by_5(a);
    }

    public static int zadanie6(int a) {
        return a ^ 3;
    }

    public static int zadanie7(int a) {

        return (int) Math.pow(a, 0.5);
    }

    public static boolean zadanie8(int a, int b, int c) {
        int max_val = Math.max(a, Math.max(b, c));
        boolean czyMozna = max_val < (a + b + c) - max_val;

        if(czyMozna){
            System.out.println(MessageFormat.format("z odcinków {0},{1},{2} mozna zbudowac trokjat",a,b,c));

        }else {
            System.out.println(MessageFormat.format("z odcinków {0},{1},{2} nie mozna zbudowac trokjata",a,b,c));
        }

        return czyMozna;
    }

}
