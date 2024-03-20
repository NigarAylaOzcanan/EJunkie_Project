package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.time.Duration;

public class BaseDriver {
    public static Logger logger= LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Tools.wait(2);
        NavigateToWebsite();
    }
    @Test
    public void NavigateToWebsite(){
        System.out.println("Test Started");
        logger.info("Log is started");
        driver.get("https://shopdemo.e-junkie.com/");
        System.out.println("Test finished");

    }
    @AfterClass
    public static void tearDown() {
        Tools.wait(3);
        driver.quit();
        logger.info("Driver Closed");
    }
    @BeforeMethod
    public void BeforeMetod(ITestResult result){
        logger.info("Test Method Started: " + result.getName());
    }
    @AfterMethod
    public void AfterMetod(ITestResult result){
        logger.info( "The Method finished: " + result.getName() + " \n The Method result : " + (result.getStatus() == 1? "Passed" : "Failed"));
    }
}
