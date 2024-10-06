import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class prompt_alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
        Alert myalert = driver.switchTo().alert();
        String alertText = myalert.getText();
        System.out.println("actual text on the alert is "+alertText);
        if (alertText.equals("Please enter your name:...."))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        Thread.sleep(3000);
        myalert.sendKeys("Hi iam Hassain");
        Thread.sleep(3000);
        myalert.accept();
    }
}
