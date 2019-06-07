package com.exercise.test.shoppingcart;

import cucumber.api.java.en.When;

public class ShoppingCartSteps {

    private ShoppingCart shoppingCart;

    public ShoppingCartSteps() { this.shoppingCart = new ShoppingCart(); }

    @When("^User verifies order")
    public void userVerifiesOrder() {
        this.shoppingCart.productIsAddedIntoCart("Test product 4");
        this.shoppingCart.goToCheckout();
    }


}
