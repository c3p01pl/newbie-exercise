Feature: Shopping
  As a user I want to order a product

Background:
  Given A user navigates to HomePage

Scenario: Ordering product
  Given User adds product to cart
  When User finalizes order
  Then Product is ordered