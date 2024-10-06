import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class blazecom_tobookticket {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/");
        WebElement dropdown1 = driver.findElement(By.cssSelector("select[name='fromPort']"));
        dropdown1.click();
        Select obj = new Select(dropdown1);
        obj.selectByValue("Portland");
        WebElement dropdown2 = driver.findElement(By.cssSelector("select[name='toPort']"));
        dropdown2.click();
        Select obj2 = new Select(dropdown2);
        obj2.selectByValue("New York");
        driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
        int rows = driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
        System.out.println(rows);
        int columns = driver.findElements(By.xpath("//table[@class=\"table\"]//tr//th")).size();
        System.out.println(columns);
        driver.findElement(By.cssSelector("body > div:nth-child(2) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#inputName")).sendKeys("Hassain");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("kandrika");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("vijayawada");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='state'])[1]")).sendKeys("Andhra Pradesh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("520015");
        WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='cardType']"));
        Thread.sleep(1000);
        dropdown3.click();
        Select obj3 = new Select(dropdown3);
        Thread.sleep(1000);
        obj3.selectByIndex(1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='creditCardNumber'])[1]")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#creditCardYear")).sendKeys("1997");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("shaik hassain");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
        String bookingresult = driver.findElement(By.cssSelector("div[class='container hero-unit'] h1")).getText();
        System.out.println(bookingresult);
        if (bookingresult.equals("Thank you for your purchase today!"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }


    }
}
