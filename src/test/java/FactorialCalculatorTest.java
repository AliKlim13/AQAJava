import static org.junit.jupiter.api.Assertions.*;
import org.example.FactorialCalculator;
import org.junit.jupiter.api.Test;


public class FactorialCalculatorTest {
    @Test
    public void testFactorialOfZero(){
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNum(){
        assertEquals(120, FactorialCalculator.factorial(5));
        assertEquals(720, FactorialCalculator.factorial(6));
    }

    @Test
    public void testFactorialOfNegativeNun(){
        Exception exception =
                assertThrows(IllegalArgumentException.class
                        ,() ->{
                    FactorialCalculator.factorial(-1);
        });
        assertEquals("Факториал не определен для отрицательных чисел", exception.getMessage());
    }

}
