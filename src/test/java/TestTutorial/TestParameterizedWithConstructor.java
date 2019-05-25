package TestTutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestParameterizedWithConstructor {

    public double a;
    public double b;
    public double result;

    private Calculator calculator;

    public TestParameterizedWithConstructor(double a, double b, double result){
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> initialize(){
        Object[][] data = new Object[][] { { 1 , 2, 3 }, { 5, 3, 8 }, { 121, 4, 484 }, {1, 1, 1} };
        return Arrays.asList(data);
    }

    @Test
    public void testAddition(){
        Assert.assertEquals(a + " + " + b, result, calculator.add(a, b), 0.0);
    }

    @Test
    public void testMultiplication(){
        Assert.assertEquals(a + " * " + b, result, calculator.multiply(a, b), 0.0);
    }
}
