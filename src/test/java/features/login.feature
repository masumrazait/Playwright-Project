Feature: Login Feature

  Scenario: Login to the parabank

    Given user navigate to the parabankwebsite
    When user validate homepage title
    Then user enters username
    And user enter the password
    And user click on login button