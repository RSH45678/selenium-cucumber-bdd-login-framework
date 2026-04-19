package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

import static org.testng.Assert.*;

public class LoginScenarioOutline1Steps {
    WebDriver driver;

    @Given("the user is on the Login page")
    public void user_is_on_login_page() {

        // Setup driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("the user enters valid username and valid password")
    public void user_enters_valid_username_and_password() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(3000);
    }

    @When("the user enters valid {string} and valid {string}")
    public void user_enters_valid_username_and_password_outline(String username, String password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
    }

    @When("the user enters invalid username and invalid password")
    public void user_enters_invalid_username_and_password() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("wrongPassword");
        Thread.sleep(3000);
    }

    @When("the user enters invalid {string} and invalid {string}")
    public void user_enters_invalid_username_and_password_outline(String username, String password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
    }

    @When("the user clicks on the submit button")
    public void user_clicks_on_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("the user should see result")
    public void user_should_be_logged_in_Successfully() throws InterruptedException {
        //verify that login was successful
        System.out.println("the user should be logged in successfully");
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentURL: "+currentUrl);
        if (currentUrl.contains("practice-test-login/"))
        {
            throw new RuntimeException("User has not logged in");
        }
        else
        {
            assert true;
        }
        driver.quit();
    }

    @Then("the user should see {string}")
    public void user_should_be_logged_in_Successfully_outline(String result) throws InterruptedException {
        System.out.println("the user should be logged in successfully");
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentURL: "+currentUrl);
        if (currentUrl.contains(result))
        {
            assert true;
        }
        else
        {
            assert false;
        }
        driver.quit();
    }

    @Then("error message should be displayed on page")
    public void user_should_see_error_message_on_the_page() throws InterruptedException {
        WebElement errorMsg= driver.findElement(By.id("error"));
        String expectedErrorMsg="Your username is invalid!";
        Assert.assertEquals(errorMsg.getText(),expectedErrorMsg);
        Thread.sleep(3000);
        driver.quit();
    }

}
