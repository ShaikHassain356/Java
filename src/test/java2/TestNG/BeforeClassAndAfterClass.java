package java2.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClass {

    /*
    1.login app
    2.search in the app
    3.advance search in the app
    4.logout the app
     */
    @BeforeClass
    void loginapp()
    {
        System.out.println("login the app");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("search in the app");
    }
    @Test(priority = 2)
    void advancesearch()
    {
        System.out.println("advance search in the appo");
    }
    @AfterClass
    void logoutapp()
    {
        System.out.println("logout the app");
    }
}
