import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Fluent_wait_declaration {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                //polling means it will try to hit element at every 5secs, in 10sec timeout it will hit 2times
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        driver.get("https://hassain-trials713.orangehrmlive.com/");
        //below after function statement is called arrow function

        WebElement username = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//input[@id='txtUsername']"));

            }
        });
        username.sendKeys("Admin");
    }
}
