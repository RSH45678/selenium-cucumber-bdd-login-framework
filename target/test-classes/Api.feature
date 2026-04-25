@Api
Feature: User API Validation

  Background:
    Given the base URI is "https://jsonplaceholder.typicode.com"

  Scenario: Verify status code for GET /users endpoint
    When I send a GET request to "/users"
    Then the response status code should be 200

  Scenario: Verify user details for a specific user
    When I send a GET request to "/users/1"
    Then the response status code should be 200
    And the response field "id" should be 1
    And the response field "username" should be "Bret"