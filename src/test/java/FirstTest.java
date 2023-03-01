import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = Const.BASEURL;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void firstEnterTest() {
        BasePage page = new BasePage();
        page.openUrl("/selenide/selenide");

        WikiPage wikiPage = page.openNextPage();
        //$(byText("Home")).should(exist); проверка подлинности страницы
        wikiPage.getElemListWiki().should(exist);
        wikiPage.clickMorePages();
        wikiPage.getSoftAssertions().shouldHave(text("SoftAssertions"));
        //$x("//div[@id='wiki-body']/ul[@first]/li/a[text()='Soft assertions']"); элемент из списка в теле

        SoftAssertionsPage softAssertionsPage = wikiPage.openNextPage();
        //$(byTagAndText("h1","SoftAssertions")).should(exist); проверка подлинности страницы
        softAssertionsPage.getExampleForJUnit5().shouldNot(empty);
    }

}
