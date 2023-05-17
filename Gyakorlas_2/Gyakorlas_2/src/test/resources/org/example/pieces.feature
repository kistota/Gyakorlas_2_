Feature: Saucedemo pieces

  Background:
    Given the home page is opened
    And the "Username" field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario Outline: Pieces in cart
    Given the <item> is added to the cart
    Then the cart should read <cart>

    #Then the price should read <total>
    Examples:
      | item                   | cart   |
      | 'Sauce Labs Backpack' |  '1'   |
      | 'Sauce Labs Fleece Jacket' |   '2'   |
      | "Sauce Labs Bike Light"|  '3'   |
      | "Test.allTheThings() T-Shirt (Red)" |  '4'   |
