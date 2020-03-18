package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class LoginPage extends Page {

    @FindBy(css = "#login-form input[name='email']")
    WebElement emailInput;
    @FindBy(css = "#login-form input[name='password']")
    WebElement passwordInput;
    @FindBy(id = "login-form-submit")
    WebElement submitButton;
    @FindBy(className = "failure")
    Collection<WebElement> failures;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    private void enterInput(WebElement inputField, String input) {
        inputField.sendKeys(input);
    } 

    public void enterEmailAddress(String email) {
        enterInput(emailInput, email);
    }

    public void enterPassword(String password) {
        enterInput(passwordInput, password);
    }

    public void submitLoginForm() {
        clickOn(submitButton);
    }

    public boolean isFailureMessageDisplayed() {
        if (failures == null) {
            failures = driver.findElements(By.className("failure"));
        }
        return failures.size() > 0;
    }
}
