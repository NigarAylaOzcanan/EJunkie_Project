package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriver {
    public static Logger logger;
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Elements elements;
    public static Actions actions;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        elements = new Elements();
        actions = new Actions(driver);
        logger = LogManager.getLogger();
        Tools.wait(2);
        NavigateToWebsite();
    }

    public void NavigateToWebsite() {

        logger.info("Navigation of the website started.");
        driver.get("https://shopdemo.e-junkie.com/");
        logger.info("Navigated to the website.");

    }

    @AfterClass
    public static void tearDown() {
        Tools.wait(3);
        driver.quit();
        logger.info("Driver Closed");
    }

    @BeforeMethod
    public void BeforeMethod() {
        logger.info("Method Started");
    }

    @AfterMethod
    public void AfterMethod(ITestResult result) {
        logger.info( result.getName() + " Method finished " + ", The result : " + (result.getStatus() == 1 ? " --->  Passed " : " --->  Failed "));
    }
}
