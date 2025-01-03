package java2.TestNG.BeforeSuiteAndAfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 {
    @BeforeSuite
    void bs()
    {
        System.out.println("this is before suite");
    }
    @Test(priority = 1)
    void c1()
    {
        System.out.println("this is the first method from class 1");
    }
    @Test(priority = 2)
    void c2()
    {
        System.out.println("this the second method from the class 1");
    }

}
