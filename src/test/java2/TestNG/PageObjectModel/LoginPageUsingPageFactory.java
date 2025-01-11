package java2.TestNG.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageFactory {

    WebDriver driver;


    //constructor

    LoginPageUsingPageFactory(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        //as we are not using driver below to find element, this statement allow us to use driver instance
    }
    //locators


    //@FindBy(xpath = "//input[@placeholder='Username']")
    //WebElement username;
    //we can also write locator statements like this
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement button;

    public void setusername(String usrname)
    {
        username.sendKeys(usrname);
    }

    public void setpassword(String pswd)
    {
        password.sendKeys(pswd);
    }

    public void clickbtn()
    {
        button.click();
    }
}
