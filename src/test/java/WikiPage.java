import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WikiPage {

    public SelenideElement getElemListWiki(){
        //$x("//div[@id='wiki-body']/ul[@first]/li[text()='Soft assertions']"); можно еще так
        return $x("//div[@id='wiki-body']//h2[text()='Chapters']/following::ul/li/a[text()='Soft assertions']");
    }

    public void clickMorePages () {
        $x("//button[contains(@class,'js-wiki-more-pages')]").click();
    }

    public SelenideElement getSoftAssertions() {
        return $x("//div[@class='wiki-rightbar']//ul/li[contains(@class,'wiki-more-pages')][2]//a");
    }

//не уверена, что норм дублировать метод. можно было бы вынести в базовый класс наверно
    public SoftAssertionsPage openNextPage() {
        $x("//div[@class='wiki-rightbar']//ul/li[contains(@class,'wiki-more-pages')][2]//a").click();
        return new SoftAssertionsPage();
    }
}
