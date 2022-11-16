package com.keyin.shapes;

public class Shape {
    private String color = "Red";
    private boolean isColorFilled = true;

    public Shape(){
        color = "Green";
        isColorFilled = true;
    }

    public Shape(String newColor, boolean isItColorFilled){
        this.color = newColor;
        this.isColorFilled = isItColorFilled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColorFilled() {
        return isColorFilled;
    }

    public void setColorFilled(boolean colorFilled) {
        isColorFilled = colorFilled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + color + " and color fill is "
                + isColorFilled;
    }
}
