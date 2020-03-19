package POM;

import CustomExceptions.LanguageNotAvailableException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page extends BasePage {

    @FindBy(id = "lang-button")
    WebElement langSelect;

    @FindBy(id = "account-button")
    WebElement accountButton;

    // ACCOUNT - GUEST
    @FindBy(id = "account-login account-registration")
    WebElement loginButton;
    @FindBy(id = "account-registration")
    WebElement regButton;

    // ACCOUNT - LOGGED IN
    @FindBy(id = "account-username")
    WebElement accountUsername;
    @FindBy(id = "account-email")
    WebElement accountEmail;
    @FindBy(id = "account-settings")
    WebElement accountSettings;
    @FindBy(id = "account-reservations")
    WebElement accountReservations;
    @FindBy(id = "account-transactions")
    WebElement accountTransactions;
    @FindBy(id = "account-logout")
    WebElement logoutButton;

    public Page(WebDriver driver) {
        super(driver);
    }

    public void hoverOverAccountButton() {
        if (accountButton == null) {
            accountButton = driver.findElement(By.id("account-button"));
        } hoverOver(accountButton);
    }

    public void hoverOverLangSelect() {
        if (langSelect == null) {
            langSelect = driver.findElement(By.id("lang-button"));
        } hoverOver(langSelect);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public void clickOnLogoutButton() {
        try {
            clickOn(logoutButton);
        } catch (TimeoutException te) {
            System.out.print("already ");
        } System.out.println("logged out");
    }

    public void selectLanguage(String lang) {
        String selector = "lang-" + lang;
        try {
            WebElement langButton = driver.findElement(By.id(selector));
            clickOn(langButton);
            System.out.print("language selected: " + lang);
        } catch (NoSuchElementException nse) {
            throw new LanguageNotAvailableException(lang);
        }
    }

    public String getAccountEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(accountEmail));
        return accountEmail.getText();
    }

}
