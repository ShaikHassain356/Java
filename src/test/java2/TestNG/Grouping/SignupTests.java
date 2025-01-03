package java2.TestNG.Grouping;

import org.testng.annotations.Test;

public class SignupTests {
    @Test(priority = 1,groups = {"regression"})
    void signupbyfb()
    {
        System.out.println("this is signup by fb");
    }
    @Test(priority = 2,groups = {"regression"})
    void signupbyinsta()
    {
        System.out.println("this is signup by insta");
    }
    @Test(priority = 3,groups = {"regression"})
    void signupbytwitter()
    {
        System.out.println("this is signup by twitter");
    }
}
