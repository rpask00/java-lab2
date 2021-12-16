package javaapplication;

public class Human {
    private int wiek, wzrost, waga;
    private String imie, plec;

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private String nazwisko;


    public Human(int wiek, int wzrost, int waga, String imie, String nazwisko) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public void setPlec(String plec) {
        this.plec = plec;
    }

    public boolean isMale(){
        return plec == "Man";
    }
}