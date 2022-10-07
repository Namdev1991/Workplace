Feature: Lead Page

  Scenario Outline: Lead Creation
    Given Browser is launch
    When Enter <Username>and Enter<Password> and click on LoginButton
    And User Should be on home page
    And user Navigate to Lead Page
    And I click on Add lead button and Enter Firstname As<Firstname> lastname As<Lastname> and Phone no<Phoneno> and click on Save button
    Then Lead Should be Created
    When I click on Delete checkbox and delete link and confirm delete
    And close the Browser

    Examples: 
      | Username | Password | Firstname | Lastname | Phoneno    |
      | admin    | Test@123 | Bahaddur  | Kumar    | 9900000000 |

  #Scenario: Lead delete
    #When I click on Delete checkbox and delete link and confirm delete
    #Then Verify deleted all leads
    #And close the Browser
