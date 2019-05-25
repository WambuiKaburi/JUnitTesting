package TestTutorial;

public class Shapes {

    public double getSquareRectanglePerimeter(double length, double width){
        return 2 * (length + width);
    }

    public double getTrianglePerimeter(double length, double width, double height){
        return length + width + height;
    }

    public double getCirclePerimeter(double diameter){
        return Math.PI * diameter;
    }

    public double getSquareRectangleArea(double length, double width){
        return length * width;
    }

    public double getTriangleArea(double base, double height){
        return 0.5 * base * height;
    }

    public double getCircleArea(double radius){
        return Math.pow((Math.PI * radius), 2);
    }

}

