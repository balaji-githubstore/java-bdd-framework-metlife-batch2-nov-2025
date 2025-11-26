package com.metlife.pages;

import com.metlife.hooks.AutomationHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * All menu and common element will be handled here
 */
public class MainPage {
    private By pimLocator=By.xpath("//span[text()='PIM']");
    private WebDriver driver = null;

    public MainPage(AutomationHooks hooks) {
        this.driver = hooks.driver;
    }
    public void clickOnPIMMenu(){
        driver.findElement(pimLocator).click();
    }
}
