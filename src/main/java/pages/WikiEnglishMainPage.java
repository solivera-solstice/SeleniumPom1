package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.IClass;
import util.Init;
import util.Log;

public class WikiEnglishMainPage {

    public static WebElement mainPage;
    public static WebElement pageLanguage;
    public static WebElement logIn;

    public static void getMainPageObject() {
        //main Page Tab link /html/body/div[5]/div[1]/div[2]/div[1]/ul/li[1]/a
        mainPage = Init.driver.findElement(By.xpath("//*[@id='p-namespaces']/ul/li[1]/a[@accesskey='c']"));
        Log.info("mainPage Found: " + mainPage.getText());
        //language account options link
        pageLanguage = Init.driver.findElement(By.xpath("//*[@id='articlecount']/a[2][@title='English language']"));
        Log.info("Language Page: " + pageLanguage.getText());
        //Log in link
        ///html/body/div[5]/div[1]/div[1]/ul/li[5]/a
        logIn = Init.driver.findElement((By.xpath("//*[@id='p-personal']/ul/li[5][@id='pt-login']/a[@accesskey='o']")));
        Log.info("Log in link found: " + logIn.getText());
    }

    public void setPageLanguage(String language){

    


    }


}


