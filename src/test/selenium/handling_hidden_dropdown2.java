import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class handling_hidden_dropdown2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //we can also inspect the hidden dropdown elements from event listeners in elements tab by removing the blur option
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();
        //span here indicates the till the last element in dropdown
        driver.findElement(By.cssSelector("div:nth-child(6) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1)")).click();
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println(options.size());
        /*advance for loop
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }*/
        //normal for loop
        for (int i=0; i<options.size(); i++)
        {
            System.out.println("the options are "+options.get(i).getText());
        }

        WebElement logout = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        logout.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
  }
}
