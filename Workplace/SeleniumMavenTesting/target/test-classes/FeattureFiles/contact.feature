Feature: Contact Feature

  Background: 
    Given Browser is launch
    When User login successfully with Valid Data
   And User Should be on home page
    When User navigate to contact creation page

  Scenario Outline: Create a contact in V Tiger Application
    And I click on Add lead button of contact page and Enter Firstname As<Firstname> lastname As<Lastname> and Phone no<Phoneno> and click on Save button
    Then Contact should be created

    Examples: 
      | Firstname | Lastname | Phoneno    |
      | Bahaddur  | Kumar    | 9900000000 |

  Scenario: Delete created Contact
    And Navigate to contacts and Select checkbox of created contact and Delete the Contact
    Then contact should be deleted
