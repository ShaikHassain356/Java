import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class datepickerusingUSERdefinedmethodIfThereAreMultiplrDatePickersInAPage {
    static void selectingbirthdaydate(WebDriver driver, String month, String year, String date) {
        while (true) {
            String actuamonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String actualyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (actualyear.equals(year) && actuamonth.equals(month)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
        List<WebElement> allthedates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a"));
        //normal for loop to click on required date that matches with above date we have given
        /*for (int i =0; i<= allthedates.size();i++)
        {
            if (allthedates.get(i).getText().equals(date))
            {
                allthedates.get(i).click();
                break;
            }
        }*/
        //enhanced for loop to click on required date
        for (WebElement dt : allthedates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        //1).selecting date using sendkeys
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/11/1997");
        //2).By using clicking on next month using while condition
        String date = "11";
        String month = "April";
        String year = "1997";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectingbirthdaydate(driver, month, year, date);
    }
}







