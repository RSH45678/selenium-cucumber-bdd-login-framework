Feature: Login functionality

  Scenario: Login with valid credentials
    Given user is on website login page
    When user enters valid credentials that is username and password
    And user clicks on submit button
    Then user should be navigated to success page

  Scenario: Login with invalid credentials
    Given user is on website login page
    When user enters invalid credentials that is username and password
    And user clicks on submit button
    Then user should see error message