Feature: Verify Login functionality

  Background: User login into application
    Given user open browser and launch application
    When user enter email as "neerajsetiafile@gmail.com" and password as "Shetty@123"
    And user clicks login button
    Then verify Home title in dashboard page

  Scenario Outline: Product added to cart and user remove the item from the card and logout successfully
    Given user clicks add to cart button
    And user navigate to cart page
    Then user clicks Checkout button to proceed
    And user enters CVV code as <cvv>
    And user enter country as "<country>"
    Then user clicks Place Order button
    And user verify order details
    When user clicks order button
    And user clicks Delete button
    Then user clicks signout button to logout.
    Then verify user logs out successfully
    Examples:
     | cvv | country |
     | 123 | India   |