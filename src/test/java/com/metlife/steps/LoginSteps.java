package com.metlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User has browser with orangehrm application")
    public void user_has_browser_with_orangehrm_application() {
        System.out.println("given");
    }

    @When("User entered username as {string}")
    public void user_entered_username_as(String username) {
        System.out.println("when" + username);
    }

    @When("User entered password as {string}")
    public void user_entered_password_as(String password) {
        System.out.println("when" + password);
    }

    @When("User click on login")
    public void user_click_on_login() {
        System.out.println("when login");
    }

    @Then("User should get into dashboard with {string} header")
    public void user_should_get_into_dashboard_with_header(String expectedValue) {
        System.out.println("then" + expectedValue);
    }

    @Then("User should get error message {string}")
    public void user_should_get_error_message(String expectedError) {
        System.out.println(expectedError);
    }
}
