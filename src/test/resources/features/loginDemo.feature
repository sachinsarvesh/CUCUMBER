Feature: Test login function
  @SmokeTest
  Scenario: Test login is successful with valid credentials

    Given browser opened
    And user is on the login page
    When user enters the credentials
    And user clicks login
    Then homepage is shown