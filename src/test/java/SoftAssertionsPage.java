import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SoftAssertionsPage {

    private final SelenideElement elemExampleForJUnit5 =
            $x("//h4[contains(text(),'Using JUnit5 extend test class')]/following::div/pre");

    public SelenideElement getExampleForJUnit5() {
        return elemExampleForJUnit5;
    }
}
