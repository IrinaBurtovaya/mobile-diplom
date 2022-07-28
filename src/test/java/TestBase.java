import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.BrowserstackMobileDriver;
import drivers.EmulationDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Objects;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;

public class TestBase {
    static String deviceHost = System.getProperty("deviceHost", "emulation");

    @BeforeAll
    public static void setup() {
        if (Objects.equals(deviceHost, "emulation")) {
            Configuration.browser = EmulationDriver.class.getName();
        } else {
            Configuration.browser = BrowserstackMobileDriver.class.getName();
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        step("Close driver", Selenide::closeWebDriver);
        if (Objects.equals(deviceHost, "browserstack")) {
            Attach.video(sessionId);
        }
    }
}