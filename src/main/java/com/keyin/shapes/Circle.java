package com.keyin.shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double newRadius){
        this.radius = newRadius;
    }
    public Circle(double newRadius, String newColor, boolean isItColorFilled){
        super(newColor, isItColorFilled);
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(double radius){
        double area = 3.14 * (radius * radius);
        return area;
    }
    double getCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    @Override
    public String toString() {
        return "A Circle with radius of "+ radius
                +" which is a subclass of "+ super.toString();
    }
}
