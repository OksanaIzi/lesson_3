import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestExistingSoftAssertionPage {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
    @Test
    void testExistingSoftAssertionPage(){
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $x("//a[text()='SoftAssertions']").shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $x("//div[@class='markdown-body']").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
