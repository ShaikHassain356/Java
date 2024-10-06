import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_authenticated_alert_using_injection_method {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String myText = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
        System.out.println("actual Text after login is "+myText);
        if (myText.equals("Congratulations! You must have the proper credentials..."))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
    }
}
