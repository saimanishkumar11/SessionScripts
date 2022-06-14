@dictionaryfunctionality
Feature: Functionality of Dictionary application

  Scenario: dictionary functionality
    Given User navigates to "https://dictionary.cambridge.org"
    When user finds the logo
    Then user validate the logo
    When user scrolls
    And user clicks on word of the year
    Then user finds word of the year
    When user enters word to get meaning
    Then user seacrh for word to listen in British English Pronounciation
    When user clicks on facebook logo
    Then user navigate to cambridge dictionary facebook page
    When user enters invalid words error message is displayed
