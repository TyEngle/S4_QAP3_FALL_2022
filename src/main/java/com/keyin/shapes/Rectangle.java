package com.keyin.shapes;

public class Rectangle extends Shape {
//rectangle class to extend shape class
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double newWidth, double newLength){
        this.width = newWidth;
        this.length = newLength;
    }
    public Rectangle(double newWidth, double newLength, String newColor, boolean isItFilled){
//obtain color and fill bool values from parent using super keyword
        super(newColor, isItFilled);
        this.width = newWidth;
        this.length = newLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double length, double width){
        double area = length * width;
        return area;
    }
    public double getPerimeter(double length, double width) {
        double perimeter = 2 * (length * width);
        return perimeter;
    }
    @Override
    public String toString(){
        return "A Rectangle with width of "+ width
                + " and length of "+ length
                + " which is a subclass of "+ super.toString();
    }


}
