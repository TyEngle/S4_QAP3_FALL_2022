package com.keyin.shapes;

public class ShapeTest {
    public static void main(String... args){
        Shape basicShape = new Shape();
        Shape customShape = new Shape("Blue", true);

    //basic shape using default constructor
        System.out.println(basicShape);
    //custom shape using parameterized constructor
        System.out.println(customShape);
}
}
