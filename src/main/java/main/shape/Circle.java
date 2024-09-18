package main.shape;

public class Circle extends Shape{

    public Circle(double width, double height, double radius, String color) {
        super(width, height, radius, color);
    }
    static double pi = Math.PI;
  @Override
    public double getRadius() {
        radius = super.getHeight() / 2;
//height == diameter
        return radius;
    }

    @Override
    public double getHeight() {
        return super.height;
    }

    public void calculateaArea(){

        double area = (super.getRadius()) * (super.getRadius()) * pi;
        System.out.printf("The area of this " + color + " circle is " + "%,.2f \n", area);

    };
    public void calculateaPerimeter(){
        double perimeter = (super.getRadius() * 2) * pi;
        System.out.printf("The perimeter of this " + color + " circle is " + "%,.2f \n", perimeter);

    };




}