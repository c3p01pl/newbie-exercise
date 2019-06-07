package com.exercise.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature/Shopping.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.exercise.test.driver",
                "com.exercise.test.homepage",
                "com.exercise.test.shoppingcart",
                "com.exercise.test.checkout"})

public class ShoppingTest {
}
