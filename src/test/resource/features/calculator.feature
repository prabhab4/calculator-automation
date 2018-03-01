
@fullCalculatorTestSuite
Feature: Calculator Automation Tests

  Background: Reset Calculator screen
    Given a clear calculator

  @scenario1 @testCase1
  Scenario: Check all numbers work
    When I press "0123456789"
    Then I should see them in the Calculator display

  @scenario2 @testCase2
  Scenario: Simple Addition
    When I press "4"
    And I press Add button
    When I press "4"
    And I press Equals button
    Then I should get "8.0"

  @scenario3 @testCase3
  Scenario: Simple Subtraction
    When I press "30"
    And I press Subtract button
    When I press "10"
    And I press Equals button
    Then I should get "20.0"

  @scenario4 @testCase4
  Scenario: Simple multiplication
    When I press "5"
    And I press Multiplication button
    When I press "10"
    And I press Equals button
    Then I should get "50.0"

  @scenario5 @testCase5
  Scenario: Simple Division
    When I press "100"
    And I press Divide button
    When I press "10"
    And I press Equals button
    Then I should get "10.0"

  @scenario6 @testCase6
  Scenario: Check long number on Display
    When I press "09398487459846745983409239834983587458479485948587596849589348034"
    Then I should get "09398487459846745983409239834983587458479485948587596849589348034"

  @scenario7 @testCase7
  Scenario: Check Clear button
    When I press "500"
    And I press "C" button
    Then I should see the display cleared

  @scenario8 @testCase8
  Scenario: Check Decimal numbers
    When I press "40.25"
    And I press Multiplication button
    When I press "2"
    And I press Equals button
    Then I should get "80.5"

  @scenario9 @testCase9 @fail
  Scenario: Check multiple operations
    When I press following numbers and operations repeatedly
      | 5 | * |
      | 2 | + |
      | 8 | / |
      | 2 | - |
      | 9 | = |
    Then I should get "5.0"

  @fail   @scenario10 @testCase10
  Scenario: Entering texts and characters
    When I click on Display field
    And I type "Test ch4r@ct£rs"
    Then I should not see them in the display field
