Feature: Get the number of digits from an integer

  Scenario Outline: Count digits in integer part of a number
    Given a number with value <value>
      When I count the digits in the integer part of the number
      Then the result should be <expectedCount>
    Examples:
    | value          | expectedCount |
    | 1234.5678      | 4             |
    | -42.42         | 2             |
    | 0              | 1             |
    | -21234532323   | 11            |
    | 123456789101.0 | 12            |