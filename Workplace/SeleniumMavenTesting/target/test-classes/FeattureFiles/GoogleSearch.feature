Feature: Searching on Google page

  # Scenario: Search on Google
  #  Given User already on Google Search Page
  # When Types Interview "Questions on BDD Aproach"
  #Then It should get result related to Search
  #And Close the browser
  Scenario Outline: Title of your scenario outline
    Given User already on Google Search Page
    When Types Interview <SearchQuestions>
    Then It should get result related to <SearchQuestions>
    And Close the browser

    Examples: 
      | SearchQuestions         |
      | Questions on BDD Aproach |
      | Questions on Api Testing |
      | Questions on SQL Testing |
