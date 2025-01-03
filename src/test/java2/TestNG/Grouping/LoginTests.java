package java2.TestNG.Grouping;

import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1,groups = {"sanity"})
    void loginbyfb()
    {
        System.out.println("this is login by fb");
    }
    @Test(priority = 2,groups = {"sanity"})
    void loginbyinsta()
    {
        System.out.println("this is login by insta");
    }
    @Test(priority = 3,groups = {"sanity"})
    void loginbytwitter()
    {
        System.out.println("this is login by twitter");
    }
}
