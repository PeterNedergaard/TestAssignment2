Feature: Utility Controller

  Scenario: Reverse
    Given I have a string "Hello"
    When I reverse the string
    Then the result should be "olleH"

  Scenario: Capitalize
    Given I have a string "hello"
    When I capitalize the string
    Then the result should be "HELLO"

  Scenario: Lowercase
    Given I have a string "HELLO"
    When I lowercase the string
    Then the result should be "hello"