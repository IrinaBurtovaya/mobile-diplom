import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MobileTests extends TestBase {

    @Test
    @DisplayName("Проверка поиска")
    void searchTest() {
        back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(CollectionCondition.sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Проверка страниц онбоардинга")
    void gettingStartedTest() {
        step("First page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Second page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("New ways to explore"));
        });

        step("Third page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Reading lists with sync"));
        });

        step("Fourth page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text("Send anonymous data"));
        });
    }

    @Test
    @DisplayName("Проверка текста объявления")
    void checkAnnouncementText() {
        back();
        step("Проверка текста объявления", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"))
                        .shouldHave(Condition.text("Customize your Explore feed\n" +
                                "\n" + "You can now choose what to show on your feed, and also prioritize your favorite " +
                                "types of content.")));
    }

    @Test
    @DisplayName("Проверка очистки поля поиска")
    void checkEmptySearch() {
        back();
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Кликаем кнопку очистки поля поиска", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/search_close_btn")).click());
        step("Проверяем текст пустого сообщения", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/search_empty_message"))
                        .shouldHave(Condition.text("Search Wikipedia in more languages")));
    }
}
