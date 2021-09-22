@stopwatchBDD
Feature: Activate the stopwatch clock, use it and close it

  Scenario: Wait 3 seconds
    Given I clicked on stopwatch button
    Then Click on inner circle button
    And wait 4000 miliseconds
    Then Click on inner circle button
    And wait 2000 miliseconds
    Then Click on inner circle button
    And wait 2000 miliseconds
    Then Click on inner circle button
    Then Click on reset button