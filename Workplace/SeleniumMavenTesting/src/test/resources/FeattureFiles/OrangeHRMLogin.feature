Feature: Login on Orange HRm

  Scenario Outline: Login
    Given Browser is Launch and Login Page is Open
    When User Enter <username> as a Username and <Password> as a password
    And click on Login Btn
    Then User should be on login page

    Examples: 
      | username | Password |
      | Admin    | admin123 |
