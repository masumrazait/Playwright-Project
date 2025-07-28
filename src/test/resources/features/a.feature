Feature: Rediff Gainers Percentage Change Validation

  Scenario: Verify percentage change of all stock rows
    Given I launch the rediff gainers page
    Then I verify the percentage change for all rows
