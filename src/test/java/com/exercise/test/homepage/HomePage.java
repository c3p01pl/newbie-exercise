package com.exercise.test.homepage;

import com.exercise.test.initpage.InitPage;
import org.junit.Assert;
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

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[1]")
    private WebElement AddTestProduct4ToCart;

    @FindBy(xpath = "//*[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement SuccesAlertPopup;

    @FindBy(xpath = "//*[@id=\"common-home\"]/div[1]/a[2]")
    private WebElement ShoppingCartLink;

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

    void addProduct4ToCart() {
        wait.forElementToBeDisplayed(5, this.AddTestProduct4ToCart, "Add product 4 button");
        AddTestProduct4ToCart.click();
    }

    void productIsAddedToShoppingCart(String successText) {

        wait.forElementToBeDisplayed(5, this.SuccesAlertPopup, "Success alert popup");
        Assert.assertEquals(successText,this.SuccesAlertPopup.getText().replace("×","").trim());
    }

    void goToShoppingCart() { this.ShoppingCartLink.click(); }
}

