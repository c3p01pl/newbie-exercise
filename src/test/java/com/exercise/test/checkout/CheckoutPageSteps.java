package com.exercise.test.checkout;

import cucumber.api.java.en.And;

public class CheckoutPageSteps {

    private CheckoutPage checkoutPage;

    public CheckoutPageSteps() {this.checkoutPage = new CheckoutPage();}

    @And("^User finalizes order")
    public void userFinalizesOrder() {
        this.checkoutPage.selectGuestRadioButton();
        this.checkoutPage.stepOneContinue();
        this.checkoutPage.userInputsName("Michal");
        this.checkoutPage.userInputsLastName("Kowalski");
        this.checkoutPage.userInputsMail("test@gmail.com");
        this.checkoutPage.userInputsTelephone("123456789");
        this.checkoutPage.userInputsCompany("Mlode ziemniaki 2018");
        this.checkoutPage.userInputsAdress("Królweska 1");
        this.checkoutPage.userInputsCity("warszawa");
        this.checkoutPage.userInputsPostCode("02-595");
        this.checkoutPage.userSelectsCountry("Poland");
        this.checkoutPage.userSelectsState("Mazowieckie");
        this.checkoutPage.stepTwoContinue();
        this.checkoutPage.stepFourContinue();
        this.checkoutPage.userClicksOnTermsAndConditons();
        this.checkoutPage.stepFiveContinue();
        this.checkoutPage.userConfirmsOrder();


    }

}
