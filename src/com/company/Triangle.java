package com.company;

//TODO 01. Utwórz klasę Triangle która:
//    - przechowuje zmienne: bokA, bokB, podstawa, wysokosc (wszystkie zmienne double)
//    - konstruktor, który wymusza podanie wszystkich zmiennych
//    - gettery i settery
//    - metoda, która obliczy obwód (zwraca wynik)
//    - metoda, która obliczy pole (zwraca wynik)
//    - metoda, która zwróci True/False - sprawdza czy trójkąt jest równoramienny
//    - metoda, która zwróci True/False - sprawdza czy trójkąt jest równoboczny
// DONE

public class Triangle {
    private double sideA;
    private double sideB;
    private double base; //podstawa
    private double hight;

    public Triangle(double sideA, double sideB, double base, double hight) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Triangle -> " +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", base=" + base +
                ", hight=" + hight;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    //TODO obwód trójkąta - done
    public double perimeterOfATriangle(){
        return sideA+sideB+base;
    }

    //TODO pole trójkąta - done
    public double fieldOfATriangle(){
        return 0.5*base*hight;
    }

    //TODO czy trójkąt równoramienny - done
    public boolean equilateralTriangle(){
        if (sideA == sideB){
            return true;
        }
        else {
            return false;
        }
    }

    //TODO czy trójkąt równoboczny - done
    public boolean isoscelesTriangle(){
        if (sideA == sideB && sideB == base){
                return true;
            }

            return false;

    }




}
