import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerce {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo-opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[placeholder]")).sendKeys("OPPO");
        //driver.findElement(By.cssSelector("button[type='submit']")).click();

    }
}
