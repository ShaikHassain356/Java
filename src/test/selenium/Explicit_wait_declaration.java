import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit_wait_declaration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        //driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Hassain");
        WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
        username.sendKeys("Hassain");
        WebElement lastname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='LastName']")));
        lastname.sendKeys("Shaik");
        WebElement register = mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#register-button")));
        register.click();
        WebDriverWait mywait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement test = mywait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("jdkjf")));
        //test.click();

    }
}
