package java2.TestNG.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    void login()
    {
      //we are passing driver parameter through object to utilize in LoginPage class
      LoginPageUsingPageFactory lp=new LoginPageUsingPageFactory(driver);
      lp.setusername("Admin");
      lp.setpassword("admin123");
      lp.clickbtn();
      Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    void exit()
    {
    driver.quit();
    }
}
