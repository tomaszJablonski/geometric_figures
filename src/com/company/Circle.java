package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle" +
                "radius =" + radius;
    }

    public double circumferenceOfACircle(){
        return 2*Math.PI*radius;
    }

    public double circleField(){
        return Math.PI*Math.sqrt(radius);
    }

    public double diamterOfACircle(){
        return Math.sqrt(radius);
    }

}
