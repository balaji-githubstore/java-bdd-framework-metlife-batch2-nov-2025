@employee
Feature: Employee
  In order to manage employee records
  as a user
  I would like add, edit, delete employee details
#add valid employee
  @addEmployee
  Scenario Outline: AddValidEmployee
    Given User has browser with orangehrm application
    When User entered username as "<username>"
    And User entered password as "<password>"
    And User click on login
    And User click on PIM menu
    And User click on Add Employee
    And User fill the employee details
      | firstName | middleName   | lastName |
      | <fname>   | <middleName> | <lname>  |
    And User click on save employee
    Then User should get the profile name as "<fname> <lname>"
    And User should get the firstname field as "<fname>"
    Examples:
      | username | password | fname | middleName | lname  |
      | Admin    | admin123 | jack  | w          | wick   |
      | Admin    | admin123 | john  | k          | cahill |