#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: As an end-user I should be able to enter and submit form
  
  @tag1
  Scenario: Verify can submit form with valid input
    Given I am on the demoqa page "https://demoqa.com/elements"
    And navigate to the text box page
    When I enter fullname "Nguyen Van A"
    And enter email "nva@gmail.com"
    And enter current address "23 Quang Trung"
    And enter permanent address "15 Le loi"
    When I click on Submit button
    Then I see the displayed outcomes with correct name "Nguyen Van A" and email "nva@gmail.com" 
    
      
     @tag2
    Scenario Outline: Verify can submit form with data-driven <account>
    Given I am on the demoqa page "https://demoqa.com/elements"
    And navigate to the text box page
    When I enter fullname with outline <fullname>
    And enter email with outline <email>
    And enter current address with outline <address>
    When I click on Submit button
    Then I see the displayed outcomes with correct name with outline <fullname> and email <email> 
      
     Examples: 
      |account   | fullname     | email        | address        | 
      |account A | Nguyen Van A | nva@gmail.com| 23 Quang Trung |
      |account B | Nguyen Van B | nvb@yahoo.com| 55 Le Duan     |
      
      
