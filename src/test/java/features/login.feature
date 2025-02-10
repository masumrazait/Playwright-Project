Feature: Login Feature

  Scenario: Login to the parabank with valid userid and password

    Given user navigate to the parabankwebsite
    When user validate homepage title
    Then user enters "valid" username
    And user enter "valid" the password
    And user click on login button


  Scenario: Login to the parabank with invalid userid and password

    Given user navigate to the parabankwebsite
    When user validate homepage title
    Then user enters "invalid" username
    And user enter "invalid" the password
    And user click on login button