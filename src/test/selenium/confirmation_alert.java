import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class confirmation_alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.cssSelector("button[onclick='myFunctionConfirm()']")).click();
        Alert myalert = driver.switchTo().alert();
        String alertText = myalert.getText();
        System.out.println("actual Text on the laert is" +alertText);
        Thread.sleep(3000);
        myalert.dismiss();
        if (alertText.equals("Press a button!"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
