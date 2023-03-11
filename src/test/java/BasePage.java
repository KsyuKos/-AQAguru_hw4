import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    private final SelenideElement wikiPage = $x("//*[@id='wiki-tab']");

    public void openUrl(String url) {
        open(url);
    }

    public WikiPage openNextPage() {
        wikiPage.click();
        return new WikiPage();
    }

}
