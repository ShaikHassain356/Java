package java2.TestNG.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DifferenceVSHardAndSoftAssertions {
    //@Test
    void Test()
    {
        System.out.println("Hassain");
        System.out.println("Shaik");
        Assert.assertEquals("Hassain","Shaik"); //if this method is failed below statements will not get executed
        System.out.println("Shaik Hassain");
    }
    @Test
    void test()
    {
        System.out.println("shaik Hassain");
        System.out.println("Hassain Shaik");
        SoftAssert as=new SoftAssert();
        as.assertEquals("Hassain","Shaik");//if this method is failed below statements will also get executed in soft assertion

        System.out.println("SHAIK HASSAIN");
        as.assertAll(); //mandatory
    }
}
