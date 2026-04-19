Feature: Login functionality

  Scenario: Login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user should be navigated to home page

  Scenario: Login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message should be displayed