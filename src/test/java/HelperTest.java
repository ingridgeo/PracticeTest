import org.junit.*;
import static NumberHelper.Helper.*;

public class HelperTest {
    @Test
    public void testGetNumDigitsInIntegerPart() {
        Assert.assertEquals(3, getNumDigitsPart(100));
        Assert.assertEquals(1, getNumDigitsPart(-3.142));
        Assert.assertEquals(4, getNumDigitsPart(9999));
        Assert.assertEquals(2, getNumDigitsPart(-25.6));
        Assert.assertEquals(1, getNumDigitsPart(0));
        Assert.assertEquals(12, getNumDigitsPart(123456789101.0));
        Assert.assertEquals(8, getNumDigitsPart(-12232329));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNumDigitsInIntegerPart_NaN() {
        getNumDigitsPart(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNumDigitsInIntegerPart_PositiveInfinity() {
        getNumDigitsPart(Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNumDigitsInIntegerPart_NegativeInfinity() {
        getNumDigitsPart(Double.NEGATIVE_INFINITY);
    }
}
