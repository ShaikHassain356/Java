package java2.TestNG.BeforeTestAndAfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

    @Test
    void search()
    {
        System.out.println("search in the app c1");
    }
    //group classes in xml file is considered as single Test that we use for @BeforeTest and @AfterTest
    //@BeforeTest will execute before the Test and @AfterTest will execute after completion of all Tests
}
