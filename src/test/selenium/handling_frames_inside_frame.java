import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class handling_frames_inside_frame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("div[id='i11'] div[class='AB7Lab Id5V1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='Other response']")).sendKeys("Hassain");
        WebElement checkbox1 = driver.findElement(By.xpath("(//div[@class='rq8Mwb'])[1]"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",checkbox1);
        WebElement checkbox2 = driver.findElement(By.cssSelector("div[id='i22'] div[class='rq8Mwb']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].click();",checkbox2);
        driver.switchTo().defaultContent();
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.cssSelector("input[name='mytext5']")).sendKeys("Hassain");
        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("actual title after clicking on link is" +title);
        if (title.equals("Open-Source RPA and Web Automation Tools for macOS, Linux and Windows"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }




    }
}
