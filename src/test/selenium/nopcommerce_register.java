import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class nopcommerce_register {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.get("https://hassain-trials713.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Hassain");
        //driver.findElement(By.cssSelector("#gender-male")).click();
        //Boolean gender = driver.findElement(By.cssSelector("#gender-male")).isSelected();
        //System.out.println("gender selected is " +gender);
        WebElement radiobutton = driver.findElement(By.cssSelector("#gender-male"));
        System.out.println("At start status of button is " +radiobutton.isSelected());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        radiobutton.click();
        System.out.println("now status of button is " +radiobutton.isSelected());
        Boolean checkbox = driver.findElement(By.cssSelector("#Newsletter")).isSelected();
        System.out.println("status of newsletter "+checkbox);




    }
}
