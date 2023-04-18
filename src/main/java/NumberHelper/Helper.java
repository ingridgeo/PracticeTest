package NumberHelper;

public class Helper {

    /**
     * The function returns the number of digits required to represent the given integer number
     *
     * @param number The input number
     * @return The number of digits required to represent the integer.
     * @throws IllegalArgumentException Throw exception in case the given number is not finite.
     */
    public static int getNumDigitsPart(Number number) {
        double absValue = Math.abs(number.doubleValue());

        if (!Double.isFinite(absValue)) {
            throw new IllegalArgumentException("The input number is not finite.");
        }

        int numberDigits = 1;
        while (absValue >= 10) {
            absValue /= 10;
            numberDigits++;
        }

        return numberDigits;
    }
}
