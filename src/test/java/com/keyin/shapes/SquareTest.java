package com.keyin.shapes;

public class SquareTest {
    public static void main(String... args) {
        Square basicSquare = new Square();
        Square customSquare = new Square(45.3);
        Square coloredSquare = new Square(7.5, "Pink", true );



        System.out.println("");
        System.out.println("Description of basic square: "
                + basicSquare);
        System.out.println("Side values of basic square: "
                + basicSquare.getSide());
        System.out.println("Area of basic square: "
                + basicSquare.getArea(1.0,1.0));
        System.out.println(basicSquare.getPerimeter(1.0,1.0));
        System.out.println("Color of basic square: "
                + basicSquare.getColor());
        System.out.println("Is basic square color filled? "
                + basicSquare.isColorFilled());

        System.out.println("");
        System.out.println("Description of custom square: "
                + customSquare);
        System.out.println("Side values of custom square: "
                + customSquare.getSide());
        System.out.println("Area of custom square: "
                + customSquare.getArea(45.3,45.3));
        System.out.println("Perimeter of custom square: "
                + customSquare.getPerimeter(45.3,45.3));
        System.out.println("Color of custom square: "
                + customSquare.getColor());
        System.out.println("Is custom square color filled? "
                + customSquare.isColorFilled());


        System.out.println("");
        System.out.println("Description of colored square: "
                + coloredSquare);
        System.out.println("Side values of colored square: "
                + coloredSquare.getSide());
        System.out.println("Area of colored square: "
                + coloredSquare.getArea(7.5,7.5));
        System.out.println("Perimeter of colored square: "
                + coloredSquare.getPerimeter(7.5,7.5));
        System.out.println("Color of colored square: "
                + coloredSquare.getColor());
        System.out.println("Is colored square color filled? "
                + coloredSquare.isColorFilled());





    }
}
