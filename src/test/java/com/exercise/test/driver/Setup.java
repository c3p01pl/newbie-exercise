package com.exercise.test.driver;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

    public static WebDriver driver;

    @Before
    public void openWebDriver() {
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }
}
