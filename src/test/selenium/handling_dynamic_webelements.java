import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handling_dynamic_webelements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://testautomationpractice.blogspot.com/");
        for (int p=2;p<=4;p++)
        {
            /*if (p>1)
            {
                int rows = driver.findElements(By.xpath("//div[@class=\"table-container\"]//tbody//tr")).size();
                System.out.println(rows);
                int cloumns= driver.findElements(By.xpath("//div[@class=\"table-container\"]//tr//th")).size();
                System.out.println(cloumns);
                for (int r=1;r<=rows;r++)
                {
                    for (int c=2;c<=cloumns;c++)
                    {
                        String data = driver.findElement(By.xpath("//div[@class=\"table-container\"]//tr["+r+"]//td["+c+"]")).getText();
                        System.out.println(data);
                    }
                }*/
            int rows = driver.findElements(By.xpath("//div[@class=\"table-container\"]//tbody//tr")).size();
            System.out.println(rows);
            int cloumns= driver.findElements(By.xpath("//div[@class=\"table-container\"]//tr//th")).size();
            System.out.println(cloumns);
            for (int r=1;r<=rows;r++)
            {
                String data = driver.findElement(By.xpath("//div[@class=\"table-container\"]//tr["+r+"]//td[3]")).getText();
                if (data.equals("$10.99"))
                {
                    for (int q=1;q<=cloumns;q++)
                    {
                        String product = driver.findElement(By.xpath("//div[@class=\"table-container\"]//tr["+q+"]//td[2]")).getText();
                        System.out.println(product);
                    }

                }
            }
                WebElement page = driver.findElement(By.xpath("//ul[@class=\"pagination\"]//*[text()="+p+"]"));
                page.click();
                Thread.sleep(3000);
            }
        }
    }
