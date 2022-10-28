package Utils;

import Test.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;


public class TestNGListeners extends BaseTest implements ITestListener {

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        String testName = result.getName();
        log.info(testName+": "+"PASSED");
    }

    public void onTestFailure(ITestResult result) {
        String methodName = result.getName();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrfile, new File("./failed_tests/"+methodName +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.error("Test '" + methodName + "' has failed and a screenshot was taken.");

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
