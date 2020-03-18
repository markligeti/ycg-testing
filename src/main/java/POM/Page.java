package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page extends BasePage {

    @FindBy(id = "account-button")
    WebElement accountButton;
    @FindBy(id = "lang-button")
    WebElement langSelect;

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
            this.accountButton = driver.findElement(By.id("account-button"));
        } hoverOver(accountButton);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public void clickOnLogoutButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
            clickOn(logoutButton);
        } catch (TimeoutException te) {
            System.out.println("already ");
        }
        System.out.println("logged out");
    }

    public String getAccountEmail() {
        wait.until(ExpectedConditions.elementToBeClickable(accountEmail));
        return accountEmail.getText();
    }

}
