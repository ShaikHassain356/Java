package java2.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class orangehrmlogin {

    /*

   1.openapp
   2.verify logo
   3.loginapp
   4.closeapp
    */

    WebDriver driver;
    @Test(priority = 1)
    public void  openapp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }

    @Test(priority = 2)
    void  logotest() throws InterruptedException {
        Thread.sleep(3000);
     WebElement logo= driver.findElement(By.cssSelector("img[alt='company-branding']"));
     boolean status= logo.isDisplayed();
     System.out.println("logo is displayed...."+status);
    }

    @Test(priority = 3)
    void  loginapp()
    {
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Test(priority = 4)
    void  closeapp() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
