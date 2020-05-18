package test;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.WikiEnglishMainPage;
import pages.WikiHome;
import util.Init;
import util.Log;

import java.io.IOException;


public class WikiEnglishMainPageTest {

    private String MAIN_PAIGE_INDICATOR = "Main Page";
    private String MAIN_PAGE_LANGUAGE = "English";

    @BeforeTest
    public void openSession() throws IOException {
        Init.setup();

    }

    @AfterTest
    public void endSession (){
        Init.quit();
    }

    @Test
    public void callPage(){
        Init.openPage();
    }

    //Open Main Page selecting English
    @Test
    public void openEnglishMainPage(){
        WikiHome.getObjects();
        Log.info("Language Selected " + WikiHome.linkEnglish.getText());
        WikiHome.linkEnglish.click();

    }

    @Test
    public void validateMainPage(){
        WikiEnglishMainPage.getMainPageObject();
        Assert.assertEquals(WikiEnglishMainPage.mainPage.getText(),MAIN_PAIGE_INDICATOR);
    }

    @Test
    public void validateMainPageLanguage(){
        WikiEnglishMainPage.getMainPageObject();
        Assert.assertEquals(WikiEnglishMainPage.pageLanguage.getText(),MAIN_PAGE_LANGUAGE);
    }

}
