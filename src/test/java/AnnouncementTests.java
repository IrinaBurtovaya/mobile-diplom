import io.appium.java_client.AppiumBy;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AnnouncementTests extends TestBase {

    @Test
    @AllureId("11320")
    @Tag("announcement")
    @DisplayName("Проверка текста объявления")
    void checkAnnouncementText() {
        step("Open page", () -> open());
        back();
        step("Проверка текста объявления", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text")).shouldHave(text("Customize your Explore feed\n" +
                        "\n" + "You can now choose what to show on your feed, and also prioritize your favorite " +
                        "types of content.")));
    }
}
