import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class prod0_creatingdialer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://space-prod0.sprinklr.com/care/voice/settings/dialer-profiles");
        driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("shaik.hassain1+prod0@partner.sprinklr.com");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']")).sendKeys("Sprinklr@987654321");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("div[class='items-center w-full justify-end gap-2 flex'] div[class='shrink-0'] div button[type='button']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hassain_aug23_pred");
        Thread.sleep(3000);
        driver.findElement(By.xpath("body > div:nth-child(42) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > MainMethodOverloading:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]")).click();
        WebElement callerid = driver.findElement(By.xpath("//body/div[@data-spaceweb='box']/div[@data-spaceweb='box']/div[@data-spaceweb='box']/div[@data-spaceweb='box']/MainMethodOverloading[@data-spaceweb='box']/div[@data-spaceweb='box']/div[@data-spaceweb='stack']/div[@data-testid='stack-item']/form[@data-spaceweb='form']/div[@data-spaceweb='box']/div/div[@data-spaceweb='box']/div[@data-spaceweb='stack']/div[@data-testid='stack-item']/div[@data-spaceweb='box']/div[@data-testid='form-control']/div[@data-spaceweb='form-control-container']/div[@data-baseweb='select']/div/div[1]"));
        callerid.click();
        callerid.sendKeys("Hassain_aug12");
        callerid.click();

    }
}
