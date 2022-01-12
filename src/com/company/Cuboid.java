package com.company;

public class Cuboid {
    private double height;
    private Rectangle rectangle;

    public Cuboid(double height, Rectangle rectangle) {
        this.height = height;
        this.rectangle = rectangle;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "Cuboid -> " +
                " height = " + height +
                ", rectangle = " + rectangle ;
    }
    //TODO zmodyfikowac boolean / zmodyfikowany
    public boolean isCube(){
        if (rectangle.getSideA() == rectangle.getSideB()){
            if (rectangle.getSideA() == height)
                return true;
        }
        else {
            return false;
        }
        return false;
    }

    //albo - oba porawne
//    public boolean isCube(){
//        return rectangle.isSquare() && rectangle.getSideA() == height;
//    }

    public double volume(){
        return (rectangle.getSideA() + rectangle.getSideB()) * height;
        //albo
        //return rectangle.field() * height;
    }

    public double area(){
        return (rectangle.getSideB() * height) + (rectangle.getSideB() * height) + (2 * rectangle.field());
        //albo
        //return  2*rectangle.field() + 2* rectangle.getSideA() * height + 2* rectangle.getSideB() * height;
    }

}
