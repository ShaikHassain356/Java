package java2.TestNG.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
    public void onStart(ITestContext context) {
        System.out.println("execution started");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test method started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test method success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test method failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test method skipped");
    }
    public void onFinish(ITestContext context) {
        System.out.println("Test execution completed");
    }
}
