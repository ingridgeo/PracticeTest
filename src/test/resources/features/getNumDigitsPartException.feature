Feature: Drop exceptions when trying to get the number of digits

  Scenario: Count digits in integer part of a number giving a NaN value
    Given a double type with the value NaN
      Then should fail throwing an exception

  Scenario: Count digits in integer part of a number giving a positive infinite value
    Given a double type with the value positive infinite
    Then should fail throwing an exception

  Scenario: Count digits in integer part of a number giving a negative infinite value
    Given a double type with the value negative infinite
    Then should fail throwing an exception
