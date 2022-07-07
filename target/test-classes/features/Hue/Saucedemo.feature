Feature: As an end-user I should be able to carry out functions on Saucedemo

  @Tag
  Scenario: Verify page title, login function, adding and removing product on Saucedemo
  
  Given I am on the Saucedemo page "https://www.saucedemo.com/"
  Then Verify the page title as "Swag Labs"
  When Enter username "standard_user"
  And  Enter password "secret_sauce"
  And Click on login button
  Then Verify default filter dropdown as A-Z
  When Change filter dropdown for From Low to High
  When Add the first product to the cart
  Then Verify the cart badge has 1 product
  When Add the last product to the cart
  Then Verify the cart badge value is increased to 2
  When Remove the first product from the cart
  Then Verify the cart badge value is decreased to 1
  When Click on the cart
  Then Verify the added product is available
 

 
