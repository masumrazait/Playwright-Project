Feature: Login to the application

  Scenario: Successful login
    Given I am on the login page
    When User login into application with username "admin" and password "admin"
    Then I click on the login button
    Then Home page should be displayed