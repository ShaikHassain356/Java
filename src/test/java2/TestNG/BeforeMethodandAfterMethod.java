package java2.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodandAfterMethod {

    /*
    1.login
    2.search
    3.logout
    4.login
    5.advance search
    6.logout

    */
    //in result only Test methods will be shown
    @BeforeMethod()
    void login()
    {
        System.out.println("login the app");
    }
    @AfterMethod()
    void logout()
    {
        System.out.println("logout the app");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("search in the app");
    }
    @Test(priority = 2)
    void advancesearch()
    {
        System.out.println("advance search in the app");
    }


}
