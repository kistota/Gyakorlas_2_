package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {

    private static final String PAGE_URL = "https://www.saucedemo.com/";

    //private final WebDriver driver;
    public final WebDriver driver;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;
    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label")
    private WebElement priceLabel;
    @FindBy(css = "#shopping_cart_container > a > span")
    private WebElement cartitem;

    private static final Map<String, By> textFields = Map.of(
            "Username", By.id("user-name"),
            "Password", By.id("password"),
            "First Name", By.id("first-name"),
            "Last Name", By.id("last-name"),
            "Zip Code", By.id("postal-code")
    );

    private static final Map<String, By> itemButtons = Map.of(
            "Sauce Labs Backpack", By.id("add-to-cart-sauce-labs-backpack"),
            "Sauce Labs Bike Light", By.id("add-to-cart-sauce-labs-bike-light"),
            "Sauce Labs Bolt T-Shirt", By.id("add-to-cart-sauce-labs-bolt-t-shirt"),
            "Sauce Labs Fleece Jacket", By.id("add-to-cart-sauce-labs-fleece-jacket"),
            "Sauce Labs Onesie", By.id("add-to-cart-sauce-labs-onesie"),
            "Test.allTheThings() T-Shirt (Red)", By.id("add-to-cart-test.allthethings()-t-shirt-(red)")
            //"Remove Sauce Labs Backpack", By.id("remove-sauce-labs-backpack"),
            //"Remove Sauce Labs Bike Light", By.id("remove-sauce-labs-bike-light")
    );

    private static final Map<String, By> navigationButtons = Map.of(
            "Login", By.id("login-button"),
            "Cart", By.className("shopping_cart_link"),
            "Checkout", By.id("checkout"),
            "Continue", By.id("continue"),
            "reset_menu", By.id("react-burger-menu-btn"),
            "reset", By.id("reset_sidebar_link"),
            "Finish", By.id("finish"),
            "Back home", By.id("back-to-products"),
            "Logout", By.id("logout_sidebar_link")
            //"Remove Sauce Labs Backpack", By.id("remove-sauce-labs-backpack")
    );

    private static final Map<String, By> navigationButtons2 = Map.of(
            "Remove Sauce Labs Backpack", By.id("remove-sauce-labs-backpack"),
            "Remove Sauce Labs Bike Light", By.id("remove-sauce-labs-bike-light"),
            "Remove Sauce Labs Fleece Jacket" ,By.id("remove-sauce-labs-fleece-jacket"),
            "Remove Sauce Labs Onesie", By.id("remove-sauce-labs-onesie"),
            "Remove Test.allTheThings() T-Shirt (Red)", By.id("remove-test.allthethings()-t-shirt-(red)")
    );

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage() {
        driver.quit();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }

    public void clickButton2(String button) {
        driver.findElement(navigationButtons2.get(button)).click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void addItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public String getTotal() {
        return priceLabel.getText();
    }
    public String getCart() {return cartitem.getText();}

   //public boolean isDisplayed() {
       //return true;
    //}
}
