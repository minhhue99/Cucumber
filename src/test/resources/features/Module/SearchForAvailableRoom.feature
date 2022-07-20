Feature: Search for available room

@SmokeTest @RegressionTest 
	Scenario: Verify that all available rooms are shown when Guest inputs the valid information
	When I enter check-in date "2022/07/25" and check-out date "2022/07/27"
	And I enter number of adult and children
	When I click on Search button
	Then I can see the displayed available rooms that meet the criteria

@SmokeTest @RegressionTest
	Scenario: Verify that all available rooms are shown when Customer inputs the valid information
	Given I login with customer account
	When I enter check-in date "2022/07/25" and check-out date "2022/07/27"
	And I enter number of adult and children
	When I click on Search button
	Then I can see the displayed available rooms that meet the criteria
	