package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SpecialPageLogIn;
import pages.WikiEnglishMainPage;
import pages.WikiHome;
import util.Init;
import util.Log;

import java.io.IOException;



public class LogInTest {


    private String USERNAME_01 = "Alegomez";
    private String PASSWORD_01 = "Pass1234";

    @BeforeTest
    public void openSession() throws IOException {
        Init.setup();

    }

    //@AfterTest
    public void endSession (){
        Init.quit();
    }

    @Test(priority = 0)
    public void callPage(){
        Init.openPage();
    }

    //Open Main Page selecting English
    @Test(priority = 1)
    public void openEnglishMainPage(){
        WikiHome.getObjects();
        Log.info("Language Selected " + WikiHome.linkEnglish.getText());
        WikiHome.linkEnglish.click();

    }

    @Test(priority = 2)
    public void logInMainPaige(){
        WikiEnglishMainPage.getMainPageObject();
        WikiEnglishMainPage.logIn.click();

    }

    @Test(priority = 3)
    public void wikiLogin(){
        SpecialPageLogIn.getLoginObjects();
    SpecialPageLogIn.setLogin(USERNAME_01, PASSWORD_01);
    SpecialPageLogIn.loginButton.click();
    }

}
