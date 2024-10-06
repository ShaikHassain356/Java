import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class handling_autosuggestion_dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(5000);
        List<WebElement> options= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role='option']"));
        System.out.println(options.size());
        //normal for loop
        /*for (int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getText());
            if (options.get(i).getText().equals("selenium testing"))
            {
                options.get(i).click();
                break;
            }
        }*/
        for (WebElement op:options)
        {
            System.out.println(op.getText());
            if (op.getText().equalsIgnoreCase("selenium testing"))
            {
                op.click();
                break; //break statement used to break after the element is found and prints till that element
            }
        }

    }
}
