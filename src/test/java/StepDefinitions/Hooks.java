package StepDefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


    public class Hooks {

        @Before("@Addition")
        public void beforeScenario(Scenario scenario) {
            System.out.println("Starting scenario: " + scenario.getName());
            // You can initialize variables, open browser, etc.
        }

        @After("@Addition")
        public void afterScenario(Scenario scenario) {
            System.out.println("Finished scenario: " + scenario.getName());
            // Cleanup actions (close browser, clear data, etc.)
        }
    }

