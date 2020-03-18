package ycg_tests;

import POM.LoginPage;
import POM.Modal;
import Utility.User;
import Utility.Utility;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    Modal successfulLoginModal = new Modal(driver);

    @Step("Enter <user_access> credentials")
    public void enterCredentials(String userAccess) {
        User user = Utility.getUser(userAccess);
        loginPage.enterEmailAddress(user.getEmail());
        loginPage.enterPassword(user.getPassword());
    }

    @Step("Click on Login button")
    public void clickOnLoginButton() {
        loginPage.submitLoginForm();
    }

    @Step("Close the successful login modal which appeared after page reload")
    public void closeSuccessfulLoginModal() {
        successfulLoginModal.closeModal();
    }

    @Step("Login fails and an error message appears after page reload")
    public void isErrorMessageDisplayed() {
        Assertions.assertTrue(loginPage.isFailureMessageDisplayed());
    }
}
