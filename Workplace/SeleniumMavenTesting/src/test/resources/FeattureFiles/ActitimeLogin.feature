
Feature: Login
  Scenario: Login 
    Given Browser is launch with correct Url
    When User Login with Valid creadentials
   Then User Should be on Home Page
   
  
  Scenario: Negative Test Case
   Given Browser is launch with correct Url
    When User Login with Invalid creadentials
    Then User Should get Error Msg