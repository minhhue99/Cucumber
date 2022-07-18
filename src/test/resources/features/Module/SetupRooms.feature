@tag
Feature: Set up Rooms

  @tag1
  Scenario: Verify that users can add a new room to the system
  
  Given Login with admin account
  When I click on Angel Down on the top right of the screen
  And Click on Go to Admin
  And Click on Room Types
	And Click on Add Room Type
	When I enter title "Lotus Room"
	And Enter price "250"
	When I select number of adult
	When I select number of children
	When I enter description "It's a beautiful room"
	When I click on Submit button
	When I enter title room to Search Box "Lotus Room"
	Then Verify the new added room type as title "Lotus Room"