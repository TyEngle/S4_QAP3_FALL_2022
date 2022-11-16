package com.keyin.shapes;

public class Square extends Rectangle{


    public Square(){}

    public Square(double side){
        super(side, side);
    }
    public Square(double side, String newColor, boolean isItFilled){
        super(side, side, newColor, isItFilled);
    }

    double getSide(){
    //used to create a square so getting length will be enough
    //because all sides will be the same anyways
        return super.getLength();
    }


    void setSide(double side){
    //will take both length and with from parent class Rectangle
    //and set them both to the parameter of side
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
    //takes width from parent class Rectangle
    //and sets value to that of parameter side
        super.setWidth(side);

    }

    @Override
    public void setLength(double side){
    //takes length from parent class Rectangle
    //and sets value to that of parameter side
        super.setLength(side);

    }

    @Override
    public String toString() {
        return "A square with side of "+getSide() + ", which is a subclass of "
                + super.toString();
    }
}
