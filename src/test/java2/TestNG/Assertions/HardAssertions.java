package java2.TestNG.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    void test()
    {

        //Assert.assertEquals("Hassain","Hassain"); //as we are expecting both need to equal, as result both are also equal, so test is passed
        //Assert.assertEquals(100,200); //test failed
        //Assert.assertEquals(true,false); //test failed

        //Assert.assertNotEquals("Hassain","Shaik"); //test passed
        //Assert.assertNotEquals(true,false); //test passed
        //Assert.assertNotEquals(100,100); //test failed

        //Assert.assertTrue(true); //test passed
        //Assert.assertTrue(false); //test failed

        //Assert.assertFalse(true); //test failed
        //Assert.assertFalse(false); //test passed

        Assert.fail();
    }
}
