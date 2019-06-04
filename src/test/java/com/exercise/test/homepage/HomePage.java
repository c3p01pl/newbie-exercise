package com.exercise.test.homepage;

import com.exercise.test.initpage.InitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends InitPage {

    private static final String HOME_PAGE_URL = "https://rekrutacjaqa2.xsolve.software/";

    @FindBy(xpath = "//*[@id=\"logo\"]")
    private WebElement header;

    @FindBy(linkText = "About Us")
    private WebElement footerAboutUs;

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement Search;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage() {
        driver.get(HOME_PAGE_URL);
        wait.forLoading(5);
    }

    void checkHeaderDisplay() {
        wait.forElementToBeDisplayed(5, this.header, "Header");
    }

    void checkFooterDisplay() {
        wait.forElementToBeDisplayed(5, this.footerAboutUs, "About Us");
    }

    void checkSearchDisplay() {
        wait.forElementToBeDisplayed(5, this.Search, "Search Bar");
    }

}

