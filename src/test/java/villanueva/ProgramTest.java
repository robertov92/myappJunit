package villanueva;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        // arrange
        int a = 10;
        int b = 10;

        // act
        int result = calculator.add(a, b);

        // asserts
        // Because of our test arrangement...

        // We expect the result value of the add() method to be 20
        Assert.assertEquals(20, result);

        // We don't expect the result of add() to be 21
        Assert.assertNotEquals(21, result);

        // The calculator object isn't null
        Assert.assertNotNull(calculator);

        // We expect a and b to be the same because of their value
        Assert.assertSame(a, b);

        // Result isn't greater than a
        Assert.assertFalse(result < a);

        // b is greater than result
        Assert.assertTrue(b < result);
    }

    @Test
    public void testSubtract(){
        // arrange
        int a = 10;
        int b = 10;

        // act
        int result = calculator.subtract(a, b);

        // asserts
        // Because of our test arrangement...

        // We expect the result value of the subtract() method to be 0
        Assert.assertEquals(0, result);

        // We don't expect the result of subtract() to be 1
        Assert.assertNotEquals(21, result);

        // The calculator object isn't null
        Assert.assertNotNull(calculator);

        // We expect a and b to be the same because of their value
        Assert.assertSame(a, b);

        // Result isn't greater than a
        Assert.assertFalse(result > a);

        // b is greater than result
        Assert.assertTrue(b > result);
    }
}
