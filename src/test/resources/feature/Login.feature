@login
Feature: Login
  In order to manage employee records
  As a user
  I want to login into the system

  Background:
    Given User has browser with orangehrm application

  @smoke  @regression @valid
  Scenario: ValidLogin
    When User entered username as "Admin"
    And User entered password as "admin123"
    And User click on login
    Then User should get into dashboard with "Quick Launch" header

  @smoke
  Scenario Outline: InvalidLogin
    When User entered username as "<username>"
    And User entered password as "<password>"
    And User click on login
    Then User should get error message "<expected_error>"
    Examples:
      | username | password | expected_error      |
      | saul     | saul123  | Invalid credentials |
      | kim      | kim123   | Invalid credentials |
