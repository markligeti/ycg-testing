package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(this.driver, 8);
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 10);
        PageFactory.initElements(factory, this);
    }

    protected void hoverOver(WebElement webElement) {
        action.moveToElement(webElement).build().perform();
    }

    protected void clickOn(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

}
