package mathstest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {//Addition test case
        assertEquals(10, MathUtils.add(7, 3));
        assertEquals(-3, MathUtils.add(-7, 4));
        assertEquals(0, MathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {//Subtraction test case
        assertEquals(13, MathUtils.subtract(14, 1));
        assertEquals(-7, MathUtils.subtract(2, 9));
        assertEquals(0, MathUtils.subtract(0, 0));
    }

    @Test
    public void testMultiply() {//Multiplication test case
        assertEquals(15, MathUtils.multiply(3, 5));
        assertEquals(-12, MathUtils.multiply(4, -3));
        assertEquals(0, MathUtils.multiply(0, 4));
    }

    @Test
    public void testDivide() {//Division test case
        assertEquals(2.5, MathUtils.divide(5, 2), 0.001);
        assertEquals(-3.0, MathUtils.divide(6, -2), 0.001);
        assertEquals(-1.0, MathUtils.divide(4, 0), 0.001); // Test for division by zero
    }
}