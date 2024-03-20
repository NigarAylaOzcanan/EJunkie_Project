package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Tools {
    public static void wait(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void jsClick(WebElement e) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].click();", e);
    }
    public static int randomGenerator(int n) {
        return (int) (Math.random() * n);
    }
    public static boolean listContainsString(List<WebElement> list, String searched) {
        boolean found = false;
        for (WebElement e : list) {
            if (e.getText().toLowerCase().equals(searched.toLowerCase()))
                found = true;
        }
        return found;
    }
}
