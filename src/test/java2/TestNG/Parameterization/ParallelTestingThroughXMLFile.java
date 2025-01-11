package java2.TestNG.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTestingThroughXMLFile {
    WebDriver driver;
    @Parameters("browser")
    @BeforeClass
    void setup(String br)
    {
      switch (br.toLowerCase())
      {
          case "chrome": driver=new ChromeDriver(); break;
          case "edge": driver=new EdgeDriver(); break;
          case  "firefox": driver=new FirefoxDriver(); break;
          default:
              System.out.println("Invalid browser name"); return;
      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.flipkart.com/");
    }
    @Test(priority = 1)
    void logotest()
    {
     boolean logostatus= driver.findElement(By.cssSelector("img[title='Flipkart']")).isDisplayed();
        Assert.assertEquals(logostatus,true);
    }
    @Test(priority = 1)
    void titletest()
    {
    Assert.assertEquals(driver.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
    }
    @Test(priority = 1)
    void urltest()
    {
    Assert.assertEquals(driver.getCurrentUrl(),"https://www.flipkart.com/");
    }
    @AfterClass
    void exit()
    {
        driver.quit();
    }
}
