import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void openUrl(String url) {
        open(url);
    }

    public WikiPage openNextPage() {
        $x("//*[@id='wiki-tab']").click();
        return new WikiPage();
    }

}
