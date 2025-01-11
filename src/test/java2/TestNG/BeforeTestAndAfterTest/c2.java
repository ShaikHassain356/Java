package java2.TestNG.BeforeTestAndAfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
    @Test
    void advancesearch()
    {
        System.out.println("advance search in the app c2");
    }
    //group classes in xml file is considered as single Test that we use for @BeforeTest and @AfterTest
    @BeforeTest
    void login()
    {
        System.out.println("login the app");
    }
    @AfterTest
    void logout()
    {
        System.out.println("logout the app");
    }
}
