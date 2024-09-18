package main.shape;

public class Heart extends Shape{

        protected double width;
        protected double height;
        protected double radius;
        protected String color;

        public Heart (double width, double height, double radius, String color) {
            super();
            this.width = width;
            this.height = height;
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void calculateArea(){
            System.out.println("Print calculated area");
        };
        @Override
        public void calculatePerimeter(){
            System.out.println("Print calculated perimeter");
        };
    }

