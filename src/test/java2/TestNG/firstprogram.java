package java2.TestNG;

import org.testng.annotations.Test;

public class firstprogram {

    @Test(priority = 1) //here priority define the execution order of the Test annotation
    void openapp()
    {
        System.out.println("open the app");
    }
    @Test(priority =2 )
    void loginapp()
    {
        System.out.println("login to app");
    }
    @Test(priority =3 )
    void logout()
    {
        System.out.println("logout the app");
    }
}
