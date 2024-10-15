import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddingAProductToACartInAmazon {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        search.sendKeys("Laptop");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(27) > div:nth-child(9) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > span:nth-child(1) > span:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")).click();

    }
}
