package java2.TestNG.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent;             // Populate common info in the report
    public ExtentTest test;                  // Creating test case entries in the report


    public void onStart(ITestContext context) {
        // Initialize the ExtentSparkReporter
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");

        // Configure the report
        sparkReporter.config().setDocumentTitle("Automation Report"); // Title of the report
        sparkReporter.config().setReportName("Functional Testing");   // Name of the report
        sparkReporter.config().setTheme(Theme.STANDARD);                 // Theme of the report

        // Initialize the ExtentReports and attach the SparkReporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Add system/environment details to the report
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Hassain");
        extent.setSystemInfo("OS", "Windows11");
        extent.setSystemInfo("Browser Name", "Chrome");
    }


    public void onTestSuccess(ITestResult result) {
        // Log the test case as PASSED
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(com.aventstack.extentreports.Status.PASS, "Test case PASSED is: " + result.getName());
    }


    public void onTestFailure(ITestResult result) {
        // Log the test case as FAILED
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(com.aventstack.extentreports.Status.FAIL, "Test case FAILED is: " + result.getName());
        test.log(com.aventstack.extentreports.Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable());
    }


    public void onTestSkipped(ITestResult result) {
        // Log the test case as SKIPPED
        test = extent.createTest(result.getName()); // Create a new entry in the report
        test.log(com.aventstack.extentreports.Status.SKIP, "Test case SKIPPED is: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Flush the report at the end of execution
        extent.flush();
    }
}
