import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class datepickerwithyeardropdown {
    static Month convertMonth(String month){
        HashMap<String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);

        if (vmonth == null){
            
            System.out.println("Invalid Month....");
        }

        return vmonth;

    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();
        String month = "April";
        String year = "1997";
        String date = "11";
        selectdate(driver, year, month, date);

    }
    static void selectdate(WebDriver driver, String year, String month, String date)
    {
        WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
        Select dropdownyear = new Select(dropdown);
        dropdownyear.selectByVisibleText(year);
        while (true) {
            String displaymonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            Month currentmonth = convertMonth(displaymonth);
            Month expectedmonth = convertMonth(month);
            //comparison of two months which are converted into the object
            int result = expectedmonth.compareTo(currentmonth);
            //result<0 it is past month
            //result>0 it is future month
            //result=0 months are equal
            if (result<0)
            {
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
            } else if (result>0)
            {
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
            }
            else
            {
                break;
            }
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));
        for (WebElement dt: dates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }
}



