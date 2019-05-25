package TestTutorial;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestJUnitParams {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    @Parameters({
            "10, 2, 20",
            "3, 4, 12"
    })

    public void testAddition(double a, double b, double result){
        Assert.assertEquals(a + " * " + b, result, calculator.add(a, b), 0.0);
    }

    @Test
    @Parameters({
            "10, 2, 20",
            "3, 4, 12"
    })

    public void testMultiplication(double a, double b, double result){
        Assert.assertEquals(a + " * " + b, result, calculator.multiply(a, b), 0.0);
    }
}
