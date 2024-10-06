import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printingatextwithnoattributes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo-opencart.com/");
        //Boolean text = driver.findElement(By.xpath("//h3[text()=\"Featured\"]")).isDisplayed();
        driver.findElement(By.xpath("//div[@id='search']/input")).sendKeys("check");
        //System.out.println(text);
    }
}
