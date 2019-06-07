Feature: Shopping
  As a user I want to order a products


Background:
  Given A user navigates to HomePage

Scenario: Ordering product flow as guest
  Given User adds product to cart
  When User verifies order
  And User finalizes order
#  Then Product is ordered
