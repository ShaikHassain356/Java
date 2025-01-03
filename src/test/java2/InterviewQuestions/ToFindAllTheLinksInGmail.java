package java2.InterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ToFindAllTheLinksInGmail {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        List<WebElement> links= driver.findElements(By.tagName("a"));
        int size= links.size();
        System.out.println(size);
        for (WebElement link:links)
        {
            System.out.println(link.getAttribute("href"));
        }
    }
}
