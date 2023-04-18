package NumberHelper;
import java.util.*;

public class ConsoleApp {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            try {
                int digitCount = Helper.getNumDigitsPart(input.nextDouble());
                System.out.println("Number of digits: " + digitCount);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number.");
            }
        }
}
