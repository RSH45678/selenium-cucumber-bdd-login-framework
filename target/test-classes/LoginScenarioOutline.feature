Feature: Login functionality

  #Scenario outline is just to avoid hardcoding data
  Scenario Outline: Login with valid credentials
    Given user is on the website login page
    When user enters valid "<username>" and valid "<password>"
    And user clicks on the submit button
    Then user should be navigated to the home page
    Examples:
      |username  |password   |
      |student   |Password123|


  Scenario Outline: Login with invalid credentials
    Given user is on the website login page
    When user enters invalid "<username>" and invalid "<password>"
    And user clicks on the submit button
    Then error message should be displayed on the page
    Examples:
      |username  |password      |
      |wrongUser |wrongPassword |