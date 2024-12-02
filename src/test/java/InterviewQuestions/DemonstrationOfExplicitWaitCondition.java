package InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemonstrationOfExplicitWaitCondition {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://space-prod0.sprinklr.com/care/voice/settings/dialer-profiles");
        WebElement username= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter Email']")));
        username.sendKeys("shaik.hassain1+prod0@partner.sprinklr.com");
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        WebElement password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter Password']")));
        password.sendKeys("Sprinklr@987654321");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
    }
}
