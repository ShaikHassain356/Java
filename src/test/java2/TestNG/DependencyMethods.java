package java2.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
    @Test(priority = 1)
    void openapp()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods = {"openapp"})
    void loginapp()
    {
        Assert.assertTrue(false);
    }

    //below all three methods are depends on login app method, if it is failed the rest all dependency methods will be failed
    @Test(priority = 3,dependsOnMethods = {"loginapp"})
    void search()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 4,dependsOnMethods = {"loginapp"})
    void advancesearch()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 5,dependsOnMethods = {"loginapp"})
    void logout()
    {
        Assert.assertTrue(true);
    }
}
