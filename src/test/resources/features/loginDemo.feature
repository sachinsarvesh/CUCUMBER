Feature: Test login function

  @SmokeTest
  Scenario Outline: Test login is successful with valid credentials

    Given browser opened
    And user is on the login page
    When user enters "<username>" and "<password>"
    And user clicks login
    Then homepage is shown

    Examples:

      | username | password |
      | user1    | pass123  |
      | tomsmith | SuperSecretPassword! |