package ycg_tests;

import Utility.Utility;
import driver.Driver;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    WebDriver driver = Driver.webDriver;
    String baseURL = Utility.getBaseURL();

    // CREDENTIALS
    String USERNAME_USER = Utility.getUsername("user");
    String PASSWORD_USER = Utility.getPassword("user");
    String USERNAME_ADMIN = Utility.getUsername("admin");
    String PASSWORD_ADMIN = Utility.getPassword("admin");
}
