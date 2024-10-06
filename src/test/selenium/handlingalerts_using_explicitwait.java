import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class handlingalerts_using_explicitwait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.cssSelector("button[onclick='myFunctionPrompt()']")).click();
        Thread.sleep(3000);
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
        myalert.sendKeys("Hassain");
        Thread.sleep(3000);
        String alertText= myalert.getText();
        System.out.println("actual text on the alert window is "+alertText);
        /*if (alertText.equals("I am an alert box!..."))
        {
            myalert.accept();
        }*/

        if (alertText.equals("Please enter your name:..."))
        {
            myalert.accept();
        }
        else
        {
            myalert.dismiss();
        }




    }
}
