package ycg_tests;

import Utility.Utility;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest {
    WebDriver driver = Driver.webDriver;
    String baseURL = Utility.getBaseURL();

    String USERNAME_USER = Utility.getUsername("user");
    String PASSWORD_USER = Utility.getPassword("user");
    String USERNAME_ADMIN = Utility.getUsername("admin");
    String PASSWORD_ADMIN = Utility.getPassword("admin");


    @AfterScenario(tags = {"login, successful"})
    public void logout() {
        hoverOverProfileButton();
        clickOnLogoutButton();
    }

    @Step("Open YCG homepage")
    public void openHomepage() {
        driver.get(this.baseURL);
    }

    @Step("Title is correct")
    public void assertTitleIsCorrect() {
        assertTrue(Driver.webDriver.getTitle().contains("Yacht Charter Guru"));
    }

    @Step("Hover over Profile button")
    public void hoverOverProfileButton() {

    }

    @Step("Select Login/Registration button")
    public void selectLoginRegButton() {

    }

    @Step("See the email address of <user_access>")
    public void assertEmailAddressVisibleAndCorrect(String emailAddress) {

    }

    @Step("Click on Login button")
    public void clickOnLoginButton() {

    }

    @Step("Click on Logout button")
    public void clickOnLogoutButton() {

    }

    @Step("Enter <user_access> credentials")
    public void enterCredentials(String userAccess) {

    }

    @Step("Check Login/Registration button")
    public void assertLoginRegButtonAvailable() {

    }
}
