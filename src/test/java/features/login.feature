Feature: Login Feature
  Scenario Outline: Login to the parabank with multiple valid userid and password

    Given user navigate to the parabankwebsite
    When user validate homepage title
    Then user enters "<username>" username
    And user enter "<password>" the password
    And user click on login button

    Examples:
      | username    | password     |
      | masumit1526 | masumit1526  |
      | masumit1526 | masumit1526@ |