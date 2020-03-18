package ycg_tests;

import POM.Modal;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;

public class LogoutTest extends BaseTest {

    Modal logoutModal = new Modal(driver);

    @Step("Successful logout modal appears")
    public void successModalAppears() {
        Assertions.assertTrue(logoutModal.isSuccessful());
    }

    @Step("Close modal")
    public void closeModal() {
        logoutModal.closeModal();
    }
}
