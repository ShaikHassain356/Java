import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class handlingcheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        // 1) normal for loop
        /*for (int i=0; i<checkboxes.size(); i++)
        {
           Thread.sleep(2000);
            checkboxes.get(i).click();
        }*/
        // 2) enhanced for loop
        /*for (WebElement checkbox : checkboxes)
        {
            checkbox.click();
        }*/
         //3) to select last three checkboxes 7-3 = 4
        /*for(int i=4; i<checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }*/
        // 4) to select starting 3 checkboxes
        /*for (int i=0; i<=2; i++)
        {
            checkboxes.get(i).click();
        }*/
        //5) selecting and un selecting particular checkboxes
        for (int i=0; i<=2; i++)
        {
            checkboxes.get(i).click();
        }
        Thread.sleep(3000);

        for (int i=0; i<checkboxes.size(); i++)
        {
            if (checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }
        }

    }
}
