Feature: Saucedemo logout

  Background:
    Given the home page is opened
    And the "Username" field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Logout
    Given the 'reset_menu' button is clicked
    When the "Logout" button is clicked
    Then the login screen displayed
