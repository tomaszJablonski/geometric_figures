package com.company;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
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

    @Override
    public String toString() {
        return "Bok A = " + sideA + " | Bok B = " + sideB;
    }

    public double circumference(){
        return 2 * sideA + 2* sideB;
    }

    public boolean isSquare(){
        if (sideA == sideB){
            return true;
        }
        else {
            return false;
        }
    }

    public double field(){
        return sideA * sideB;
    }

}