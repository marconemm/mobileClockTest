@alarmBDD
Feature: Seting an alarm

	Background:
		Given Clicks on alarm button  	
    Then Clicks on Add alarm button
    And Sets the time to "2:30"
    Then Sets the AM|PM selector to "AM"
    Then Clicks on OK button
  	Then Cheks if a new alarm with the folowinf informations exists:
				|2:30|
				|AM|
		And Set its name to "Automation test Alarm - OK!"
	
	Scenario: Exclude the previous created alarm
		When The "Automation test Alarm - OK!" alarm is located, delete it