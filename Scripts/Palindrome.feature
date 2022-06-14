Feature: Determine if String is Palindrome or not. A string is a palindrome if it reads
  the same backwards as forwards.
@PositiveTest @SmokeTest @RegressionTest
Scenario: Valid Palindrome
    Given I entered string "Refer"
    When I test it for Palindrome
    Then the result should be "true"
@NegetiveTest
Scenario: Invalid Palindrome
    Given I entered string "Coin"
    When I test it for Palindrome
    Then the result should be "false"
@ParameterizedTest @SmokeTest
Scenario Outline: Check if String is Palindrome
    Given I entered word <wordToTest>
    When I test it for Palindrome
    Then the output should be <output>
    Examples:
      | wordToTest | output  |
      | "madam"    | "true"  |
      | "radar"    | "true" |
      | "Space"    | "false" |
      | "level"    | "true"  |

