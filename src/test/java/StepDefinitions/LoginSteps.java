package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters valid username and password")
    public void valid_credentials() {
        System.out.println("Entered valid credentials");
    }

    @When("user enters invalid username and password")
    public void invalid_credentials() {
        System.out.println("Entered invalid credentials");
    }

    @And("clicks on login button")
    public void click_login() {
        System.out.println("Clicked login button");
    }

    @Then("user should be navigated to home page")
    public void success() {
        System.out.println("Login success");
    }

    @Then("error message should be displayed")
    public void error() {
        System.out.println("Login failed");
    }
}