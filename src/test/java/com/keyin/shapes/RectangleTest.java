package com.keyin.shapes;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle basicRectangle = new Rectangle();
        Rectangle customRectangle = new Rectangle(5,12);
        Rectangle coloredRectangle = new Rectangle(7,13,"Orange",true);



        System.out.println("");
        System.out.println(basicRectangle);
        System.out.println("Area of rectangle: "
                + basicRectangle.getArea(1,1));
        System.out.println("Parameter of rectangle: "
                + basicRectangle.getPerimeter(1,1));
        System.out.println("");
        System.out.println(customRectangle);
        System.out.println("Area of rectangle: "
                + customRectangle.getArea(5,12));
        System.out.println("Parameter of rectangle: "
                + customRectangle.getPerimeter(5,12));
        System.out.println("");
        System.out.println(coloredRectangle);
        System.out.println("Area of rectangle: "
                + coloredRectangle.getArea(7,13));
        System.out.println("Parameter of rectangle: "
                + coloredRectangle.getPerimeter(7,13));
        System.out.println("");


    }
}
