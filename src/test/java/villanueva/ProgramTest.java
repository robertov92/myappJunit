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

        // asserts                                   // Because of our test arrangement...
        Assert.assertEquals(20, result);        // We expect the result value of the add() method to be 20
        Assert.assertNotEquals(21, result);   // We don't expect the result of add() to be 21
        Assert.assertNotNull(calculator);               // The calculator object isn't null
        Assert.assertSame(a, b);                        // We expect a and b to be the same because of their value
        Assert.assertFalse(result < a);         // Result isn't greater than a
        Assert.assertTrue(b < result);          // b is greater than result
    }

    @Test
    public void testArray(){
        // arrange & act
        int[] expected = {1,2,3};
        int[] actual = { 1, 2, 3 };

        // asserts
        Assert.assertArrayEquals(expected, actual);     // Both arrays contain the same values in the same order
        Assert.assertNotSame(expected, actual);         // Expected and actual are different objects
    }
}
