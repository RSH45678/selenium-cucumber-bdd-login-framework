package StepDefinitions;

import io.cucumber.java.en.*;

public class AppLoginSteps {

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("User enters valid email and password")
    public void User_enters_valid_email_and_password() {
        System.out.println("Entered valid email and password");
    }

    @And("User clicks on login button")
    public void User_click_login() {
        System.out.println("Clicked login button");
    }

    @Then("User should be logged in successfully to the application")
    public void User_Login_success() {
        System.out.println("User logged in successfully");
    }
}