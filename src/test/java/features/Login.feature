Feature: Login to the application

  Scenario: Successful login
    Given I am on the login page
    When User login into application with username "masumit1526" and password "masumit1526"
    Then I click on the login button
    Then Home page should be displayed