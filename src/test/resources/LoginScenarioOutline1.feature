#Here one scenario with validating both positive and negative assertions

Feature: Login functionality

  #Scenario outline is just to avoid hardcoding data
  Scenario Outline: User logs in with valid credentials
    Given the user is on the Login page
    When the user enters valid "<username>" and valid "<password>"
    And the user clicks on the submit button
    Then the user should see "<result>"
    Examples:
      |username  |password      |result                 |
      |student   |Password123   |logged-in-successfully |
      |wrongUser |wrongPassword |practice-test-login    |