import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handling_alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
        Alert myalert = driver.switchTo().alert();
        Thread.sleep(5000);
        String alertText = myalert.getText();
        myalert.accept();
        if (alertText.equals("I am an alert box!"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
