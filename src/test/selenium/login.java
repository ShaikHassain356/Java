import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo-opencart.com/");
        String browser_title = driver.getTitle();
        //System.out.println(browser_title);
        if (browser_title.equals("Your Store"))
        {
            System.out.println("Test case passed");
        }
        else
        {
            System.out.println("Test case failed");
        }
        driver.manage().window().minimize();
        driver.close();

    }

}
