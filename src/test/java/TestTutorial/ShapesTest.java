package TestTutorial;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ShapesTest {

    private Shapes shapes;

    @Before
    public void setup(){
        shapes = new Shapes();
    }

    @Test
    @Parameters({
            "5, 5, 21",
            "3, 4, 14"
    })

    public void squareRectanglePerimeterTest(double length, double width, double perimeter){
        Assert.assertEquals("Square/Rectangle Perimeter is wrong: " + length + " + " + width + " * 2 " , perimeter, shapes.getSquareRectanglePerimeter(length, width), 0.1);
    }

    @Test
    @Parameters({
            "5, 20, 10, 35",
            "3, 4, 14, 21"
    })

    public void trianglePerimeterTest(double length, double width, double height, double perimeter){
        Assert.assertEquals("Triangle Perimeter is wrong: " + length + " + " + width + " + " + height, perimeter, shapes.getTrianglePerimeter(width, height, length), 0.1);
    }

    @Test
    @Parameters({
            "5, 15.7",
            "3, 9.4"
    })

    public void circlePerimeterTest(double diameter, double perimeter){
        Assert.assertEquals("Circle Perimeter is wrong: " + Math.PI + " * " + diameter, perimeter, shapes.getCirclePerimeter(diameter), 0.1);
    }

    @Test
    @Parameters({
            "5, 15.7, 78.5",
            "3, 9.4, 28.2"
    })


    public void squareRectangleAreaTest(double length, double width, double area){
        Assert.assertEquals("Square/Rectangle Area is wrong: " + length + " * " + width, area, shapes.getSquareRectangleArea(length, width), 0.1);
    }

    @Test
    @Parameters({
            "5, 15.7, 39.25",
            "3, 9.4, 14.1"
    })

    public void triangleAreaTest(double base, double height, double area){
        Assert.assertEquals("Triangle Area is wrong: 0.5 * " + base + " * " + height, area, shapes.getTriangleArea(base, height), 0.1);
    }

    @Test
    @Parameters({
            "5, 246.7",
            "3, 88.8"
    })

    public void circleAreaTest(double radius, double area){
        Assert.assertEquals("Circle Area is wrong: pi * " + radius + " squared", area, shapes.getCircleArea(radius), 0.1);
    }

}
