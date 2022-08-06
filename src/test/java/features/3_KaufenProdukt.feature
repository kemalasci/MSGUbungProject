Feature: Kaufen functionality

  Background:
    Given user on homePage
    When user Login as follows
      | userName | adanali   |
      | password | Ksa12345. |
    Then  User should be able to login successfully
  @smoke
  Scenario: Buy Laptop
    Given navigate to HP PAVILION 15Z TOUCH LAPTOP
    Then one blue 3 red Laptop add to cart
    And The user should be able to purchase the products
    Then total product price and amount paid must be verified
    And Fill in payment method and purchase is complete
    Then Success message should be displayed
