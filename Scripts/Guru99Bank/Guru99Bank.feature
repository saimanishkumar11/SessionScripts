Feature: Log in to Guru99Bank

  Background: User is already registered with Guru99 Bank

  Scenario: Successful Login
    Given User navigates to "http://demo.guru99.com/V4"
    When User enters valid credentials
      | mngr412467 | asyhYsE |
    Then User Login Successful

