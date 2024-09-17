package main.shape;

public class Shape {
    // Properties
    protected double width;
    protected double height;
    protected double radius;
    protected String color;

    public Shape(double width, double height, double radius, String color) {
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    // Abstract methods for calculating area and perimeter
    public static void calculateArea(){

    };

    public static void calculatePerimeter(){

    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

