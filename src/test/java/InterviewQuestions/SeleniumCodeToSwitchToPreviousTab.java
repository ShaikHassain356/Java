package InterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SeleniumCodeToSwitchToPreviousTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(3000);
        ((ChromeDriver) driver).executeScript("window.open('https://www.oracle.com/java/technologies/downloads/', '_blank');");
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }
}
