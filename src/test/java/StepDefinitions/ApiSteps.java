package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiSteps {

    private Response response;

    @Given("the base URI is {string}")
    public void setBaseURI(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

    @When("I send a GET request to {string}")
    public void sendGETRequest(String endpoint) {
        response = given()
                .header("Content-Type", "application/json")
                .when()
                .get(endpoint);

        // Optional: log request & response for debugging
        response.then().log().all();
    }

    @Then("the response status code should be {int}")
    public void validateStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the response field {string} should be {int}")
    public void validateIntegerField(String jsonPath, int expectedValue) {
        response.then().body(jsonPath, equalTo(expectedValue));
    }

    @Then("the response field {string} should be {string}")
    public void validateStringField(String jsonPath, String expectedValue) {
        response.then().body(jsonPath, equalTo(expectedValue));
    }
}