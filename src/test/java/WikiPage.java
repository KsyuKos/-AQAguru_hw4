import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WikiPage {

    private final SelenideElement elemSoftAssertInContent =
            $x("//div[@id='wiki-body']//h2[text()='Chapters']/following::ul/li/a[text()='Soft assertions']");
    private final SelenideElement morePages = $x("//button[contains(@class,'js-wiki-more-pages')]");
    private final SelenideElement elemSoftAssertInSidebar =
            $x("//div[@class='wiki-rightbar']//ul/li[contains(@class,'wiki-more-pages')][2]//a");

    public SelenideElement getElemListWiki() {
        return elemSoftAssertInContent;
    }

    public WikiPage clickMorePages() {
        morePages.click();
        return this;
    }

    public SelenideElement getSoftAssertions() {
        return  elemSoftAssertInSidebar;
    }

    public SoftAssertionsPage openNextPage() {
        elemSoftAssertInSidebar.click();
        return new SoftAssertionsPage();
    }
}
