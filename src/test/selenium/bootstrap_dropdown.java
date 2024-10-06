import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class bootstrap_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        WebElement bootstrap = driver.findElement(By.xpath("//button[@type='button']"));
        bootstrap.click();
        Thread.sleep(2000);
        //driver.findElements(By.xpath("//input[value='jQuery']"));
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
        System.out.println(options.size());

        //normal for loop
       /*for (int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getText());
            Thread.sleep(1000);
            options.get(i).click();*/
        //advanced for loop
        for(WebElement op:options)
        {
            String hassain = op.getText();
            if (hassain.equals("Java")||hassain.equals("Oracle")||hassain.equals("Angular"))
            {
                op.click();
            }
        }

        }

    }

