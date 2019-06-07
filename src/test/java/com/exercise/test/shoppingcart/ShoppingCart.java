package com.exercise.test.shoppingcart;


import com.exercise.test.initpage.InitPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart extends InitPage {

    @FindBy(xpath = "//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
    private WebElement collapseEstimateShipping;

    @FindBy(xpath = "//*[@id=\"input-zone\"]")
    private WebElement regionStateDropdown;

    @FindBy(xpath = "//*[@id=\"input-postcode\"]")
    private WebElement postCodeField;

    @FindBy(xpath = "//*[@id=\"button-quote\"]")
    private WebElement getQuote;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    private WebElement goToCheckout;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
    private WebElement productNameInCart;

    ShoppingCart() {
        PageFactory.initElements(driver, this);
    }

    void productIsAddedIntoCart(String productName){
        String displayedProductName = this.productNameInCart.getText();
        System.out.println(displayedProductName);
        System.out.println(productName);
        Assert.assertEquals(productName.trim(),this.productNameInCart.getText().trim());
    }

    void goToCheckout(){
        wait.forElementToBeDisplayed(5,this.goToCheckout,"Go to checkout button");
        this.goToCheckout.click();
    }

    void setShippingAndTaxes(String State,String PostCode){
        this.collapseEstimateShipping.click();
        wait.forElementToBeDisplayed(5, this.regionStateDropdown, "Region / State Dropdown");
        Select dropDownState = new Select(this.regionStateDropdown);
        dropDownState.selectByVisibleText(State);
        this.postCodeField.sendKeys(PostCode);


    }
}
