package java2.TestNG.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;


    //constructor

    LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //locators


    By txt_usrname=  By.xpath("//input[@placeholder='Username']");
    By txt_psw=By.xpath("//input[@placeholder='Password']");
    By button=By.xpath("//button[normalize-space()='Login']");

    public void setusername(String usrname)
    {
        driver.findElement(txt_usrname).sendKeys(usrname);
    }

    public void setpassword(String pswd)
    {
        driver.findElement(txt_psw).sendKeys(pswd);
    }

    public void clickbtn()
    {
        driver.findElement(button).click();
    }
}
