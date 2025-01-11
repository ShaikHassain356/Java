package java2.TestNG.BeforeSuiteAndAfterSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class class3 {
    @AfterSuite
    void as()
    {
        System.out.println("this is after suite");
    }
    @Test(priority = 1)
    void c5()
    {
        System.out.println("this is the first method from class 3");
    }
    @Test(priority = 2)
    void c6()
    {
        System.out.println("this is the second method from the class 3");
    }
}
