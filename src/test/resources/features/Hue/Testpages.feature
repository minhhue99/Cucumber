Feature: As an end-user I should be able to enter and submit form

 @Test1
  Scenario: Verify can enter and submit form
    Given I am on the testpage "https://testpages.herokuapp.com/styled/basic-html-form-test.html"
    Then Verify page title as "HTML Form Elements"
    When I enter username "seleniumUser"
    And enter password "P@ssword123"
    And enter comment "fidhfnsdfndlksjfldjfldksjflkdsjfkldsjfkldsjfdlkfjdsklfjskl"
    When select only checkbox 2
    When select radio button 1
    When select Multiple Select Values as Item 1 and Item 2
    When select Drop down item 5
    When click on Submit button
    Then I see the displayed outcomes with correct username "seleniumUser" and password "P@ssword123"
    
 @Test2
 Scenario Outline: Verify can enter and submit form with data-driven
 		Given I am on the testpage "https://testpages.herokuapp.com/styled/basic-html-form-test.html"
 		Then Verify page title as "HTML Form Elements"
    When I enter username with outline <username>
    When enter password with outline <password>
    And enter comment "fidhfnsdfndlksjfldjfldksjflkdsjfkldsjfkldsjfdlkfjdsklfjskl" 
    When select only checkbox 2
    When select radio button 1
    When select Multiple Select Values as Item 1 and Item 2
    When select Drop down item 5
    When click on Submit button
    Then I can see the displayed outcomes with correct username <username> and password <password>
 		
 		Examples: 
      | username    	| password     | 
      | usera123			| P@ssword456  |
      | userb123			| P@ssword789  | 
 
   

  
