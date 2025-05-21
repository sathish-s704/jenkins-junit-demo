import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(7, calc.add(4, 3));
    }

    @Test
    public void testSub() {
        assertEquals(-1, calc.sub(2, 3));
    }

    @Test
    public void testMul() {
        assertEquals(6, calc.mul(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(1, calc.div(4, 3)); 
    }

    @Test
    public void testMod() {
        assertEquals(1, calc.div(5, 3)); 
    }
}
