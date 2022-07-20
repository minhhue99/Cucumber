@tag
Feature: Check Booking

  @SmokeTest @RegressionTest
  Scenario: Verify that the booking details will be displayed by using the valid booking number
  When I click on Search icon and enter Booking number "7045-937000020"
	And Click on Search button
	Then I see the displayed booking number as "Id: 7045-937000020"

  Scenario: Verify that a message is shown when entering invalid booking number into the Search field 
  When I click on Search icon and enter Booking number "7045-9370&*&*)"
	And Click on Search button
	Then I see the displayed message as "Opps ! No booking found !"
