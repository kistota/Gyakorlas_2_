package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @When("the {string} button is clicked2")
    public void theButtonIsClicked2(String button) {
        homePage.clickButton2(button);
    }

    //@When("the {string} button is clicked")
   // public void theButtonIsClicked(String button) {
       //homePage.clickButton(button);
    //}

    @AfterAll
    public static void cleanUp() {

       // homePage.closePage();
    }

    @Then("the login screen displayed")
    public void theLoginScreenDisplayed() {
        assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
       // assert(driver.findElement(By.id("login-button")).isDisplayed());

    }
    //public boolean isDisplayed() {

        //assert(driver.findElement(By.id("loginButton")).isDisplayed());
       // return true;
    //}

    @Then("the cart should read {string}")
    public void theCartShouldReadCart( String cartitem) {
        {
            assertEquals(cartitem, homePage.getCart());
        }
    }

}
