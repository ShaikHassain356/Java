package java2.TestNG;

import org.testng.annotations.*;

public class AllAnnotations {
    @BeforeSuite
    void bs()
    {
        System.out.println("this is the method before suite");
    }
    @AfterSuite
    void as()
    {
        System.out.println("this is the method after suite");
    }
    @BeforeTest
    void bt()
    {
        System.out.println("this is the method before test");
    }
    @AfterTest
    void at()
    {
        System.out.println("this is the method after test");
    }
    @BeforeClass
    void bc()
    {
        System.out.println("this is the method before class");
    }
    @AfterClass
    void ac()
    {
        System.out.println("this is the method after class");
    }
    @BeforeMethod
    void bm()
    {
        System.out.println("this is the method before test method");
    }
    @AfterMethod
    void am()
    {
        System.out.println("this is the method after test method");
    }
    @Test(priority = 1)
    void method()
    {
        System.out.println("this is the first test method");
    }
    @Test(priority = 2)
    void method2()
    {
        System.out.println("this is the second test method");
    }
}
