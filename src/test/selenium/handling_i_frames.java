import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handling_i_frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));;
        driver.switchTo().frame(frame1);
        driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("Hassain");
        driver.switchTo().defaultContent();
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("Hassain");
        driver.switchTo().defaultContent();
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("Hassain");
        driver.switchTo().defaultContent();



    }
}
