import io.appium.java_client.AppiumBy;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    @Test
    @AllureId("11311")
    @Tag("searchTest")
    @DisplayName("Проверка поиска")
    void searchTest() {
        step("Open page", () -> open());
        back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @AllureId("11321")
    @Tag("clear")
    @DisplayName("Проверка очистки поля поиска")
    void checkEmptySearch() {
        step("Open page", () -> open());
        back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Кликаем кнопку очистки поля поиска", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/search_close_btn")).click());
        step("Проверяем текст пустого сообщения", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/search_empty_message")).shouldHave(text("Search Wikipedia in more languages")));
    }
}
