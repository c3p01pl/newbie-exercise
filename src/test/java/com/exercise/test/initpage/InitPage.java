package com.exercise.test.initpage;

import com.exercise.test.driver.Setup;
import com.exercise.test.driver.Wait;
import org.openqa.selenium.WebDriver;

public class InitPage {

    protected WebDriver driver;
    protected Wait wait;

    public InitPage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
