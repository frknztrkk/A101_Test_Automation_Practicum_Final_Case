package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReport {

    public static ExtentReports extent;


    public static ExtentReports createReport() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualDate = format.format(date);

        ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+
                "/Reports/ExecutionReport_"+actualDate+".html");

        extent = new ExtentReports();
        extent.attachReporter(sparkReport);
        sparkReport.config().setDocumentTitle("Hepsiburada Test Results");
        sparkReport.config().setTheme(Theme.DARK);
        sparkReport.config().setReportName("Hepsiburada Automation");
        extent.setSystemInfo("Executed on Environment: ", "www.hepsiburada.com");
        extent.setSystemInfo("Executed on Browser: ", "chrome");
        extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
        extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));


        return extent;
    }


}
