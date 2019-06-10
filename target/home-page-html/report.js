$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Shopping.feature");
formatter.feature({
  "name": "Shopping",
  "description": "  As a user I want to order a products",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A user navigates to HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.aUserNavigatesToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Ordering product flow as guest",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User adds product to cart",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.userAddsProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies order",
  "keyword": "When "
});
formatter.match({
  "location": "ShoppingCartSteps.userVerifiesOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User finalizes order",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutPageSteps.userFinalizesOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product is ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutPageSteps.productIsOrdered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});