package Utils;
import Test.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestNGListeners extends BaseTest implements ITestListener {

    private static ExtentReports extent = ExtentReport.createReport();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();





    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest("["+result.getTestClass().getName()+"]"+"--->"+result.getName());
        test.assignAuthor(System.getProperty("user.name"));
        extentTest.set(test);

    }

    public void onTestSuccess(ITestResult result) {
        Markup m = MarkupHelper.createLabel(result.getMethod().getMethodName()+" is PASSED.", ExtentColor.GREEN);
        extentTest.get().log(Status.PASS,m);

        String testName = result.getName();
        log.info(testName+": "+"PASSED");
    }

    public void onTestFailure(ITestResult result) {
        String methodName = result.getName();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);

        String screenshotPath ="/Reports/Failed_Test_Screenshots/"+methodName+actualDate+".png";
        try {
                FileUtils.copyFile(scrfile, new File("./Reports/Failed_Test_Screenshots/"+methodName+actualDate+".png"));
        }   catch (IOException e) {
            e.printStackTrace();
        }
        try{
                extentTest.get().fail("<font color=red>"+"Screenshot of failure"+"</font><br>", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        }   catch (IOException e){
                extentTest.get().fail("Test Failed, cannot attach screenshot");
        }
        Markup m = MarkupHelper.createLabel(result.getMethod().getMethodName()+" is FAILED.", ExtentColor.RED);
        extentTest.get().log(Status.FAIL, m);
        extentTest.get().log(Status.FAIL, result.getThrowable());
        log.error("Test '" + methodName + "' has failed and a screenshot was taken.");
    }

    public void onTestSkipped(ITestResult result) {
        Markup m = MarkupHelper.createLabel(result.getMethod().getMethodName()+" is SKIPPED.", ExtentColor.YELLOW);
        extentTest.get().log(Status.SKIP, m);



    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {
    extent.flush();

    }
}

