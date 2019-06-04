package com.exercise.test.homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to HomePage")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
        this.homePage.checkHeaderDisplay();
        this.homePage.checkSearchDisplay();
    }

    @Then("^A page is ok")
    public void aPageIsOk(){
        this.homePage.checkFooterDisplay();
    }

}
