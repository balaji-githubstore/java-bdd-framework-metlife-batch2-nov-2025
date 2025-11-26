package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import com.metlife.pages.DashboardPage;
import com.metlife.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    public LoginSteps(LoginPage loginPage, DashboardPage dashboardPage) {
        this.loginPage = loginPage;
        this.dashboardPage = dashboardPage;
    }


    @Given("User has browser with orangehrm application")
    public void user_has_browser_with_orangehrm_application() {
        loginPage.navigateToUrl();
    }

    @When("User entered username as {string}")
    public void user_entered_username_as(String username) {
        loginPage.enterUsername(username);
    }

    @When("User entered password as {string}")
    public void user_entered_password_as(String password) {
        loginPage.enterPassword(password);
    }

    @When("User click on login")
    public void user_click_on_login() {
        loginPage.clickOnLogin();
    }

    @Then("User should get into dashboard with {string} header")
    public void user_should_get_into_dashboard_with_header(String expectedValue) {
        String actualValue = dashboardPage.getQuickLaunchText();
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Then("User should get error message {string}")
    public void user_should_get_error_message(String expectedError) {
        String actualError = loginPage.getInvalidErrorMessage();
        Assert.assertEquals(actualError, expectedError);
    }
}
