package ycg_tests;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTest extends BaseTest {

    @Step("Open YCG homepage")
    public void openHomepage() {
        driver.get(baseURL);
        assertThat(Driver.webDriver.getTitle()).contains("Yacht Charter Guru");
    }
}