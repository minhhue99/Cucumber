@tag
Feature: Cancel Booking

   @SmokeTest @RegressionTest
  Scenario: Verify that user can cancel a booking if check-in date has not come yet
  Given I login with customer account
  When I click on Angel Down on the top right of the screen
  And Click on My Bookings button
  And Click on Cancel button
  When I select the reason
  And Click on Cancel Submit button
	Then I see that the number of canceled booking is decreased by 1