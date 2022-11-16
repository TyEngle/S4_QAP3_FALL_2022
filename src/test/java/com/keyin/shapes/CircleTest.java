package com.keyin.shapes;

public class CircleTest {
    public static void main(String[] args) {
        Circle basicCircle = new Circle();
        Circle customCircle = new Circle(5.0);
        Circle coloredCircle = new Circle(3.0,"Blue", true);

        System.out.println("");
        System.out.println(basicCircle);
        System.out.println("Area of: "+ basicCircle.getArea(1.0));
        System.out.println("Circumference of: "+ basicCircle.getCircumference(1.0));
        System.out.println("");

        System.out.println(customCircle);
        System.out.println("Area of: "+ customCircle.getArea(5.0));
        System.out.println("Circumference of: "+ customCircle.getCircumference(5.0));
        System.out.println("");

        System.out.println(coloredCircle);
        System.out.println("Area of: "+ coloredCircle.getArea(3.0));
        System.out.println("Circumference of: "+ coloredCircle.getCircumference(3.0));
        System.out.println("");
    }
}
