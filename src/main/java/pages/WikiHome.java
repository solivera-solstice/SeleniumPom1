package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import util.Init;
import util.Log;


public class WikiHome {



    public static WebElement logoPage;
    public static WebElement linkEnglish;

    public static void getObjects(){
        logoPage = Init.driver.findElement(By.xpath("//div[@class='central-textlogo-wrapper']//div[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']"));
        Log.info("Logo Page Text found " + logoPage.getText());
        linkEnglish = Init.driver.findElement(By.xpath("//div[@class='central-featured-lang lang1']//a[@id='js-link-box-en']//strong"));
        Log.info("Language found  " + WikiHome.linkEnglish.getText());

    }




}
