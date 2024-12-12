import org.example.FactorialCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFactorialCalculator {
    @Test
    public void testFactorialOfZero(){
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNum(){
        assertEquals(FactorialCalculator.factorial(5), 120);
        assertEquals(FactorialCalculator.factorial(6), 720);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNum(){
        FactorialCalculator.factorial(-1);
    }
}
