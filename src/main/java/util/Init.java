package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.Properties;


public class Init {

    private static Properties Properties;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws IOException {

        Properties = Reader.readProperties("src/main/selenium.properties");
        System.setProperty("webdriver.chrome.driver",  Properties.getProperty("cromeDriverpath"));
        //System.setProperty("webdriver.chrome.driver",  "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        driver.quit();
    }

    public static void openPage(){
        driver.get(Properties.getProperty("baseurl"));
        //driver.get("https://www.wikipedia.org/");
    }

}
