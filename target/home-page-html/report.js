$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Shopping.feature");
formatter.feature({
  "name": "Shopping",
  "description": "  As a user I want to order a product",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ordering product",
  "description": "",
  "keyword": "Scenario"
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
formatter.step({
  "name": "A page is ok",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.aPageIsOk()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});