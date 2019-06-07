package com.exercise.test.checkout;

import com.exercise.test.initpage.InitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends InitPage {

    //Continue buttons
    @FindBy(xpath = "//*[@id=\"button-account\"]")
    private WebElement continueAccountButton;

    @FindBy(xpath = "//*[@id=\"button-guest\"]")
    private WebElement continueGuestButton;

    @FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
    private WebElement continueShippingMethodButton;

    @FindBy(xpath = "//*[@id=\"button-payment-method\"]")
    private WebElement continuePaymentMethodButton;

    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    private WebElement orderCorfimationButton;

    //Billing Details Fields
    @FindBy(xpath = "//*[@id=\"input-payment-firstname\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"input-payment-lastname\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"input-payment-email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"input-payment-telephone\"]")
    private WebElement telephoneField;

    @FindBy(xpath = "//*[@id=\"input-payment-company\"]")
    private WebElement companyField;

    @FindBy(xpath = "//*[@id=\"input-payment-address-1\"]")
    private WebElement addressFirstField;

    @FindBy(xpath = "//*[@id=\"input-payment-address-2\"]")
    private WebElement addresSecondField;

    @FindBy(xpath = "//*[@id=\"input-payment-city\"]")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"input-payment-postcode\"]")
    private WebElement postcodeField;

    @FindBy(xpath = "//*[@id=\"input-payment-country\"]")
    private WebElement countryField;

    @FindBy(xpath = "//*[@id=\"input-payment-zone\"]")
    private WebElement regionStateField;

    //Radio buttons
    @FindBy(xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label")
    private WebElement guestCheckoutRadioButton;

    @FindBy(xpath = "//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input")
    private WebElement flatRateRadioButton;

    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[1]/label/input")
    private WebElement paymentMethodRadioButton;

    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
    private WebElement agreeTermsAndConditionsRadioButton;

    //Others
    @FindBy (xpath = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[1]/a")
    private WebElement summaryProductName;

    @FindBy (xpath = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[1]/td[2]")
    private WebElement subTotalPriceCell;

    @FindBy (xpath = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[2]/td[2]")
    private WebElement shippingRatePriceCell;

    @FindBy (xpath = "//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[3]/td[2]")
    private WebElement TotalPriceCell;

    CheckoutPage() { PageFactory.initElements(driver, this); }

    void fillFieldWithText(WebElement textfield, String text){
        wait.forElementToBeDisplayed(5, textfield, "Element " + textfield);
        textfield.sendKeys(text);
    }

    void selectGuestRadioButton(){
        wait.forElementToBeDisplayed(10,this.guestCheckoutRadioButton, "select guest radio button");
        this.guestCheckoutRadioButton.click();
    }

    void clickButton(WebElement element){
        wait.forElementToBeDisplayed(10,element,"Where is " + element);
        element.click();
    }

    void stepOneContinue(){
        clickButton(this.continueAccountButton);
    }

    void stepTwoContinue(){
        clickButton(this.continueGuestButton);
    }


    void stepFourContinue(){
        clickButton(this.continueShippingMethodButton);
    }

    void stepFiveContinue(){
        clickButton(this.continuePaymentMethodButton);
    }

    void userConfirmsOrder(){
        clickButton(this.orderCorfimationButton);
    }

    void userInputsName(String name){
        fillFieldWithText(this.firstNameField, name);
    }

    void userInputsLastName(String lastname){
        fillFieldWithText(this.lastNameField,lastname);
    }

    void userInputsMail(String mail){
        fillFieldWithText(this.emailField,mail);
    }

    void userInputsTelephone(String telephone){
        fillFieldWithText(this.telephoneField,telephone);
    }

    void userInputsCompany(String company){
        fillFieldWithText(this.companyField,company);
    }

    void userInputsAdress(String address){
        fillFieldWithText(this.addressFirstField,address);
    }

    void userInputsCity(String city){
        fillFieldWithText(this.cityField,city);
    }

    void userInputsPostCode(String postCode){
        fillFieldWithText(this.postcodeField, postCode);
    }

    void userSelectsCountry(String country){
        Select dropDownState = new Select(this.countryField);
        dropDownState.selectByVisibleText(country);
    }

    void userSelectsState(String state){
        Select dropDownState = new Select(this.regionStateField);
        dropDownState.selectByVisibleText(state);
    }

    void userClicksOnTermsAndConditons(){
        clickButton(agreeTermsAndConditionsRadioButton);
    }

}
