package com.metlife.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomationHooks {
    public WebDriver driver;

    //runs before each scenario
    @Before
    public void beforeScenario()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //runs after each scenario
    @After
    public void afterScenario()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
