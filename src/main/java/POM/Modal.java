package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Modal extends BasePage {

    @FindBy(className = "remodal")
    WebElement remodal;
    @FindBy(className = "remodal-close")
    WebElement closeButton;
    @FindBy(tagName = "p")
    WebElement modalMessage;

    public Modal(WebDriver driver) {
        super(driver);
    }

    public void closeModal() {
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        clickOn(closeButton);
    }

    public boolean isSuccessful() {
        return remodal.getAttribute("class").contains("remodal-success");
    }

}
