package com.metlife.steps;

import com.metlife.hooks.AutomationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginSteps {
    @Given("User has browser with orangehrm application")
    public void user_has_browser_with_orangehrm_application() {
        AutomationHooks.driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("User entered username as {string}")
    public void user_entered_username_as(String username) {
        AutomationHooks.driver.findElement(By.name("username")).sendKeys(username);
    }

    @When("User entered password as {string}")
    public void user_entered_password_as(String password) {
        AutomationHooks.driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("User click on login")
    public void user_click_on_login() {
        AutomationHooks.driver.findElement(By.xpath("//button[contains(normalize-space(),'Log')]")).click();
    }

    @Then("User should get into dashboard with {string} header")
    public void user_should_get_into_dashboard_with_header(String expectedValue) {
        String actualValue= AutomationHooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Then("User should get error message {string}")
    public void user_should_get_error_message(String expectedError) {
        String actualError= AutomationHooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError,expectedError);
    }
}
