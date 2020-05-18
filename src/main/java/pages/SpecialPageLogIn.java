package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.LogInTest;
import util.Init;
import util.Log;

public class SpecialPageLogIn {

    public static WebElement textPageLogin;
    public static WebElement boxUsername;
    public static WebElement boxPassword;
    public static WebElement loginButton;

    public static void getLoginObjects(){
        boxUsername = Init.driver.findElement(By.xpath("//*[@id='userloginForm']/form/div/div[1]/div/input[@id='wpName1']"));
        boxPassword = Init.driver.findElement(By.xpath("//*[@id='userloginForm']/form/div/div[2]/div/input[@id='wpPassword1']"));
      //html/body/div[3]/div[3]/div[3]/div/div[2]/form/div/div[4]/div/button
        loginButton = Init.driver.findElement(By.xpath("//*[@id='userloginForm']/form/div/div[4]/div/button[@id='wpLoginAttempt']"));

    }

    public static void setLogin(String valueUsername,String valuePassword){

        boxUsername.sendKeys(valueUsername);
        boxPassword.sendKeys(valuePassword);

    }


}
