#@employee
#Feature: Employee
#  In order to manage employee records
#  as a user
#  I would like add, edit, delete employee details
#
#  @addEmployee
#  Scenario: AddValidEmployee
#    Given User has browser with orangehrm application
#    When User entered username as "Admin"
#    And User entered password as "admin123"
#    And User click on login
#    And User click on PIM menu
#    And User click on Add Employee
#    And User fill the employee details
#      | firstName | middleName | lastName |
#      | john      | w          | wick     |
#    And User click on save employee
#    Then User should get the profile name as "john wick"
#    And User should get the firstname field as "john"
#
#  @addEmployee
#  Scenario: AddValidEmployee
#    Given User has browser with orangehrm application
#    When User entered username as "Admin"
#    And User entered password as "admin123"
#    And User click on login
#    And User click on PIM menu
#    And User click on Add Employee
#    And User fill the employee details
#      | firstName | middleName | lastName |
#      | jack      | w          | wick     |
#    And User click on save employee
#    Then User should get the profile name as "jack wick"
#    And User should get the firstname field as "jack"