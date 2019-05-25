package TestTutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestParameterized {
    @Parameterized.Parameter(0)
    public double a;
    @Parameterized.Parameter(1)
    public double b;
    @Parameterized.Parameter(2)
    public double result;

    private Calculator calculator;

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
