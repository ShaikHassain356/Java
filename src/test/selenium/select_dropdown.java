import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.util.List;

public class select_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement dropdownelement = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown = new Select(dropdownelement);
        List<WebElement> items =  dropdown.getOptions();
        for (int i=0;i<items.size();i++)
        {
            System.out.println(items.get(i).getText());
        }
        //System.out.println(items);
        //System.out.println("list"+items.size());
        /*Thread.sleep(3000);
        dropdown.selectByVisibleText("Germany");
        Thread.sleep(3000);*/
        //dropdown.deselectByVisibleText("Germany");
        //dropdown.selectByValue("germany");
        //dropdown.selectByIndex(1);
        //String textafterselected = dropdownelement.getText();
        //System.out.println("actual text after selecting"+textafterselected);
        /*if (textafterselected.equals("Canada"))
        {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }*/


    }
}
