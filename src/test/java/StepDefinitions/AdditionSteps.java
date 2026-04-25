package StepDefinitions;
import io.cucumber.java.en.*;
import static org.testng.Assert.*;

public class AdditionSteps {

    int a, b, result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers(int x, int y)
    {
        a = x;
        b = y;
    }

    @When("I add them")
    public void i_add_them()
    {
        result = a + b;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected)
    {
        System.out.println("Result: " + result);
    }
}

