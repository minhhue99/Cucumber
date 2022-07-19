@tag1
Feature: Search, Booking and Payment functionality

  @SmokeTest @RegressionTest
  Scenario: Verify that Guest can search by the valid information, select and book a room, make payment with credit card
	When Enter check-in date "2022/07/18"
	And Enter check-out date "2022/07/25"
	And Enter number of adult
	And Enter number of children
	When Click on Search button
	When Click on View Details button
	When Click on Book Now button
	When Enter Fullname "Le Nu Minh Hue"
	And Enter Email "minhhue.contact@gmail.com"
	And Enter Phone "0944067799"
	And Enter Address "131 Luong Nhu Hoc"
	When I tick Checkbox
	When I click on Submit
	When Enter card number
	And Enter name on card
	And Enter expiry date
	And Enter CVV number
	When I click on Pay Now button
	Then I see the success message "Thank you! Your booking has been placed. We will contact you to confirm about the booking soon."
				
	
	@SmokeTest @RegressionTest
	Scenario: Verify that Customer can search by the valid information, select and book a room, make payment with credit card
	Given Login with customer account
	When Enter check-in date "2022/07/20"
	And Enter check-out date "2022/07/21"
	And Enter number of adult
	And Enter number of children
	When Click on Search button
	When Click on View Details button
	When Click on Book Now button
	And Enter Phone "0944067799"
	And Enter Address "131 Luong Nhu Hoc"
	When I tick Checkbox
	When I click on Submit
	When Enter card number
	And Enter name on card
	And Enter expiry date
	And Enter CVV number
	When I click on Pay Now button
	Then I see the success message "Thank you! Your booking has been placed. We will contact you to confirm about the booking soon."
	
	
	
	
	

	
	
  
