Feature: Saucedemo remove button

  Background:
    Given the home page is opened
    And the "Username" field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked
    And the 'reset_menu' button is clicked
    And the 'reset' button is clicked
    And the 'Cart' button is clicked
    And the 'Checkout' button is clicked
    And the 'First Name' field is filled with 'testname_first'
    And the 'Last Name' field is filled with 'testname_last'
    And the 'Zip Code' field is filled with '1111'
    And the 'Continue' button is clicked
    And the 'Finish' button is clicked
    And the 'Back home' button is clicked

  Scenario Outline: Remove button
    Given the <button1> is added to the cart
    And the 'Sauce Labs Bolt T-Shirt' is added to the cart
    When the <button2> button is clicked2
    Then the cart should read '1'
    Examples:
      |button1 | button2 |
      | 'Sauce Labs Backpack' |'Remove Sauce Labs Backpack' |
      |"Sauce Labs Fleece Jacket" | "Remove Sauce Labs Fleece Jacket"|
      |'Sauce Labs Bike Light'| 'Remove Sauce Labs Bike Light'|
      |"Sauce Labs Onesie"       | "Remove Sauce Labs Onesie"|
      |"Test.allTheThings() T-Shirt (Red)"| "Remove Test.allTheThings() T-Shirt (Red)"|
     # |"Test.allTheThings() T-Shirt (Red)"| |