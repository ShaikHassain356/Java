package java2.TestNG.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvidersDemo {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "logindata")
    void script(String username,String password)
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.cssSelector("#input-email")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Boolean status= driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (status==true)
        {
           driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")) .click();
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }


    }
    @AfterClass
    void close()
    {
     driver.close();
    }

    // if we want to provide only specific data then we can use indices
    @DataProvider(name="logindata",indices = {0,3,4})
    Object[][] logintestdata()
    {
        Object data[][]={
                {"xyz@gmail.com","123456"},
                {"abc@gmail.com","365479"},
                {"def@gmail.com","798555"},
                {"hassainshaik347@gmail.com","H@$$@in1104"},
                {"tuv@gmail.com","5452452"}

        };
        return data;
    }
}
