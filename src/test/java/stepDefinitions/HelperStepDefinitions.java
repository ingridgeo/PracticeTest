package stepDefinitions;

import static NumberHelper.Helper.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import NumberHelper.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        monochrome = true
        //strict = true
)
public class HelperStepDefinitions {
    private Number num;
    private int actualCount;

    @Given("a number with value {double}")
    public void setNumber(Number num) {
        this.num = num;
    }

    @When("I count the digits in the integer part of the number")
    public void countDigitsInIntegerPart() {
        actualCount = getNumDigitsPart(num);
    }

    @Then("the result should be {int}")
    public void verifyCount(int expectedCount) {
        assertEquals(expectedCount, actualCount);
    }

    @Given("a double type with the value NaN")
    public void setNaNValue() {
        this.num = Double.NaN;
    }

    @Given("a double type with the value positive infinite")
    public void setDoublePosInfValue() {
        this.num = Double.POSITIVE_INFINITY;
    }

    @Given("a double type with the value negative infinite")
    public void setDoubleNegInfValue() {
        this.num = Double.NEGATIVE_INFINITY;
    }

    @Then("should fail throwing an exception")
    public void countDigitsException()  throws Throwable {
        try {
            getNumDigitsPart(num);
        } catch (Exception e) {
            assertEquals(Helper.ERR_INVALID_ARG, e.getMessage());
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
}