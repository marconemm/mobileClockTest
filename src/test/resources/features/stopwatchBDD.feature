@stopwatchBDD
Feature: Activate the stopwatch clock, use it and close it

  Scenario: Wait três seconds
    Given Open the app Clock
    And Clicks on stopwatch button
    And Clicks on inner circle button
    Then Clicks on lap button
    Then Clicks on lap button    
    Then Clicks on reset button
    Then Closes teh app Clock
    
    