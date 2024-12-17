@GrowwLogin
Feature: Login to the  web application
  Login to the Groww application with valid credentials
  
  @Login
  Scenario: Login to the web application with valid credentials
    Given I navigate to the web application "https://groww.in/login"
		When I enter "label=Your Email Address" as "dipakkalel1235@gmail.com"
		And I click on "VT=Continue" button
		
  
