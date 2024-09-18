package main.shape;

public class Square extends Shape {
    public Square(double width, double height, String color) {


        super(width, height, 0, color);  //radius is not applicable to square

    }


    @Override
    public static void calculateArea(){
        double squareArea = super.width * super.height;
        System.out.println("The area of this square is" + squareArea);

    }

    @Override
    public static void calculatePerimeter(){
        double squarePerimeter = 4 * super.width;
        System.out.println("The perimeter of this square is" + squarePerimeter);
    }

}
