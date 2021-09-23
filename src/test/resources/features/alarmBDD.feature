@alarmBDD
Feature: Seting an alarm
		
	Scenario Outline: Create and exclude an alarm to <time>, <AMPM>
		Given Clicks on alarm button  	
    Then Clicks on Add alarm button
    And Sets its time to <time>
    Then Sets its AM|PM selector to <AMPM>
    Then Clicks on OK button
  	Then Cheks if a new alarm with the folowing informations exists:
				|<time>|
				|<AMPM>|
		And Set its name to "Automation test Alarm - OK!"
		Then the alarm with the folowing informations exists, delete it:
				|<time>|
				|<AMPM>|
				
	Examples:
    |   time   | AMPM |
    |  "10:51" | "AM" |
    |  "3:59" | "PM" |