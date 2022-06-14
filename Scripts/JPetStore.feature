Feature: Test Login Functionality

  @Login
  Scenario Outline: Check login is sucessfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username         | password    |
      | saimanishkumar11 | Sairam@1998 |

  @SearchPet
  Scenario: To validate search
    Given user is on home page
    And user search for pets
      | cat |
    When user click on search
    Then user is navigated to pet page
