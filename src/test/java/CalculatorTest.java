import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddTwoNumbers(){
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    public void canSubtractTwoNumbers(){
        assertEquals(1, calculator.subtract(2,1));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    public void canDivideTwoNumbers(){
        assertEquals(2.5, calculator.divide(5.0,2.0), 0.0);
    }
}



