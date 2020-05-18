package test;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.WikiHome;

import util.Init;
import java.io.IOException;


public class WikiHomeTest {

    private String LOGO_PAGE = "Wikipedia";
    private String LOGO_TEXT = "English";



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

    @Test
    public void validatePage(){
        WikiHome.getObjects();
        Assert.assertEquals(WikiHome.logoPage.getText(),LOGO_PAGE);
    }
    @Test
    public void validateLanguages(){
        WikiHome.getObjects();
        Assert.assertEquals(WikiHome.linkEnglish.getText(), LOGO_TEXT);
    }
}
