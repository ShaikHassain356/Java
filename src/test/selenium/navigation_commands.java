import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_commands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.navigate().to("https://www.instagram.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
    }
}
