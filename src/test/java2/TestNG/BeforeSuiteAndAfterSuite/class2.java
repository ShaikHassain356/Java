package java2.TestNG.BeforeSuiteAndAfterSuite;

import org.testng.annotations.Test;

public class class2 {
    @Test(priority = 1)
    void c3()
    {
        System.out.println("this is the first method from c2");
    }
    @Test(priority = 2)
    void c4()
    {
        System.out.println("this is the second method from c2");
    }
}
