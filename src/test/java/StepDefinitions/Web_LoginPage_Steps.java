package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

import static org.testng.Assert.*;

public class Web_LoginPage_Steps {

    WebDriver driver;

    @Given("user is on website login page")
    public void user_is_on_login_page() {

        // Setup driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("user enters valid credentials that is username and password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(3000);
    }

    @When("user enters invalid credentials that is username and password")
    public void user_enters_invalid_username_and_password() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("wrongPassword");
        Thread.sleep(3000);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("user should be navigated to success page")
    public void user_should_be_navigated_to_success_page() throws InterruptedException {
        WebElement successMsg= driver.findElement(By.className("post-title"));
        String actualText = successMsg.getText();
        String expectedText="Logged In Successfully";
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(3000);
        driver.quit();
    }

    @Then("user should see error message")
    public void user_should_see_error_message() throws InterruptedException {
        WebElement errorMsg= driver.findElement(By.id("error"));
        String expectedErrorMsg="Your username is invalid!";
        Assert.assertEquals(errorMsg.getText(),expectedErrorMsg);
        Thread.sleep(3000);
    }
}
