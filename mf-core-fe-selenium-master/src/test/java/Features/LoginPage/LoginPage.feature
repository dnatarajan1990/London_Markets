Feature: LoginPage
  As a admin, I want to login to the application

  Scenario: The user should able to login and proceed to the next page
    Given The user has launched the application in dev environment
    When the user enters the username as "mekala"
    And the user enters the password as "pwd"
    And the user clicks on the login button
    Then the user should be on the home page