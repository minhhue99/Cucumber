Feature: Search for available room

@SmokeTest @RegressionTest 
	Scenario: Verify that all available rooms are shown when Guest inputs the valid information
	When Enter check-in date "2022/07/25"
	And Enter check-out date "2022/07/27"
	And Enter number of adult
	And Enter number of children
	When Click on Search button
	Then I can see the displayed available rooms that meet the criteria

@SmokeTest @RegressionTest
	Scenario: Verify that all available rooms are shown when Customer inputs the valid information
	Given I login with customer account
	When Enter check-in date "2022/07/25"
	And Enter check-out date "2022/07/27"
	And Enter number of adult
	And Enter number of children
	When Click on Search button
	Then I can see the displayed available rooms that meet the criteria
	