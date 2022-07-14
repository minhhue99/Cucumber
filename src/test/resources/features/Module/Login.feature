@tag
Feature: Login functionality

  @SmokeTest
  Scenario Outline: Verify successful login with valid <role> account
    When Click on Login tab
    When I enter username with outline <username>
    And I enter password with outline <password>
    When Click on Sign in button
    Then I see the displayed account name with correct name <account name>
 
    Examples: 
     |role 		|username	|password	|account name	|
     |Admin		|admin		|123456		|Admin				|	
  	 |Staff		|test			|123456		|test					|
     |Customer|hoangny	|123456		|U799710			|
     
     
  @SmokeTest
  Scenario Outline: Verify error message when loginning with <case>
    When Click on Login tab
    When I enter username with outline <username>
    And I enter password with outline <password>
    When Click on Sign in button
    Then I see the error message "Error: Wrong username or password !!!"
      
    Examples: 
   |case												|username			|password	|
   |wrong password							|admin				|123abc		|
   |wrong username							|test123			|123456		|
   |wrong username and password	|customer123	|klajfka	|
      

    
    
  
      
   
       