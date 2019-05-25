package TestTutorial;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

   @Before
    public void init(){
       calculator = new Calculator();
   }

   @Test
    public void addTest(){
       Assert.assertEquals(5, calculator.add(1, 2), 0.1);
   }

    @Test
    public void multiplyTest(){
        Assert.assertEquals(2, calculator.multiply(1, 2), 0.1);
    }
}
