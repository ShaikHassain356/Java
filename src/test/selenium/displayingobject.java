import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.systeminfo.model.Size;

import java.util.List;

public class displayingobject {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo-opencart.com/");
        Thread.sleep(2000);
        //Boolean displaying_object = driver.findElement(By.cssSelector("body header")).isDisplayed();
        //System.out.println(displaying_object);
        //driver.findElement(By.partialLinkText("Soft")).click();
        //List<WebElement> headerelements = driver.findElements(By.className("list-inline-item"));
        //System.out.println("size of all elements: "+headerelements.size());
        List<WebElement> allthelinks = driver.findElements(By.tagName("13355"));
        System.out.println("total number of links: "+allthelinks.size());
        if (allthelinks.size() == 102)
        {
            System.out.println("Test passed");
        }
        else
            System.out.println("Test Failed");
    }
}
