import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handling_static_webtable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        //1) to capture the number of rows
        int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
        System.out.println(rows);
        //2) to capture no of columns in table
        int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
        System.out.println(columns);
        //3)to capture specific element from the table
        String datafromtable = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]")).getText();
        System.out.println(datafromtable);
        //4) to capture all the values from the table we will use bested for loop
        System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
        /*for (int r=2;r<=rows;r++)
        {
            for (int c=1;c<=columns;c++)
            {
                String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
                //backward t used for tab space
                System.out.print(value+"\t");
            }
            System.out.println();
        }*/

        //5) print bookname whose author name is mukesh
        /*for (int r=2;r<=rows;r++)
        {
            String authorname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
            if (authorname.equals("Mukesh"))
            {
                String bookname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
                System.out.println(bookname+"\t"+authorname);
            }
        }*/
        //6) sum of all the book prices
        int total=0;
        for(int r=2;r<=rows;r++)
        {
            String totalamount = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
            total=total+Integer.parseInt(totalamount);
        }
        System.out.println("total amount is "+total);


    }
}
