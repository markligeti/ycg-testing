package ycg_tests;

import POM.MainPage;
import Utility.Utility;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest {
    WebDriver driver = Driver.webDriver;
    String baseURL = Utility.getBaseURL();
    MainPage mainPage = new MainPage(driver);

/*
    @AfterScenario(tags = {"login, successful"})
    public void logout() {
        System.out.println("!!! AFTER SCENARIO !!!");
        hoverOverProfileButton();
        clickOnLogoutButton();
    }
*/

    @Step("Open YCG homepage")
    public void openHomepage() {
        driver.get(baseURL);
    }

    @Step("Title is correct")
    public void assertTitleIsCorrect() {
        assertTrue(Driver.webDriver.getTitle().contains("Yacht Charter Guru"));
    }

    @Step("Hover over Account button")
    public void hoverOverProfileButton() {
        mainPage.hoverOverAccountButton();
    }

    @Step("Select Login/Registration button")
    public void selectLoginRegButton() {
        mainPage.clickOnLoginButton();
    }

    @Step("Select Logout button")
    public void clickOnLogoutButton() {
        mainPage.clickOnLogoutButton();
    }

    @Step("See the email address of <user_access>")
    public void assertEmailAddressVisibleAndCorrect(String userAccess) {
        String email = Utility.getUser(userAccess).getEmail();
        String accountEmail = mainPage.getAccountEmail();
        Assertions.assertEquals("(" + email + ")", accountEmail);
    }

    @Step("Check Login/Registration button")
    public void assertLoginRegButtonAvailable() {

    }

}
