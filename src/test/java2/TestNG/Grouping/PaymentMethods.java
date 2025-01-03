package java2.TestNG.Grouping;

import org.testng.annotations.Test;

public class PaymentMethods {
    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paybypaytm()
    {
        System.out.println("payment done by paytm");
    }
    @Test(priority = 2,groups = {"sanity","regression","functional"})
    void paybyphonepe()
    {
        System.out.println("payment done by phonepe");
    }
    @Test(priority = 3,groups = {"sanity","regression","functional"})
    void paybygpay()
    {
        System.out.println("payment done by gpay");
    }
}
