package Test;

import Data.configProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import java.time.Duration;


public class BaseTest {
    protected static Logger log = LogManager.getLogger();
    protected static WebDriver driver;


    @BeforeClass
    public void setUp(){//Web sayfası ayağa kaldırıldı.Login işlemi sunucu tarafından engellendiği için options değerleri girildi.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-insecure-localhost");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        if(configProperties.property.getProperty("browser").equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        } else if (configProperties.property.getProperty("browser").equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new ChromeDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(configProperties.property.getProperty("baseUrl"));
        log.info("Web Sayfası Açıldı.");
    }
    @AfterClass
    public void tearDown(){//Web sayfası kapatıldı.
    driver.quit();
        log.info("Web Sayfası Kapatıldı.");
    }

}
